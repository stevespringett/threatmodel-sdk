/*
 * This file is part of the ThreatModeling SDK.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package us.springett.threatmodeling.tools.mstmt2016;

import us.springett.threatmodeling.IParser;
import us.springett.threatmodeling.exception.ParseException;
import us.springett.threatmodeling.model.Asset;
import us.springett.threatmodeling.model.DataFlow;
import us.springett.threatmodeling.model.Threat;
import us.springett.threatmodeling.model.ThreatModel;
import us.springett.threatmodeling.tools.mstmt2016.model.ThreatInstance;
import us.springett.threatmodeling.tools.mstmt2016.model.ThreatType;
import us.springett.threatmodeling.tools.mstmt2016.util.ParseUtil;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class Parser implements IParser {

    public ThreatModel parse(File file) throws ParseException {
        try {
            // Parse the native threat model
            JAXBContext jaxbContext = JAXBContext.newInstance(us.springett.threatmodeling.tools.mstmt2016.model.ThreatModel.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            // Prevent XML External Entity Injection
            XMLInputFactory xif = XMLInputFactory.newFactory();
            xif.setProperty(XMLInputFactory.IS_SUPPORTING_EXTERNAL_ENTITIES, false);
            xif.setProperty(XMLInputFactory.SUPPORT_DTD, false);
            XMLStreamReader xsr = xif.createXMLStreamReader(new StreamSource(file.getAbsolutePath()));

            us.springett.threatmodeling.tools.mstmt2016.model.ThreatModel nativeModel =
                    (us.springett.threatmodeling.tools.mstmt2016.model.ThreatModel) unmarshaller.unmarshal(xsr);

            // Create a new threat model object
            ThreatModel threatModel = new ThreatModel();

            // Add the native threat model object format to the threat model object
            threatModel.setNativeThreatModel(nativeModel);

            //Extract the Assets so that they can be assigned to threats
            List<Asset> assets = ParseUtil.lookupAssets(nativeModel);

            //Extract all dataFlows
            List<DataFlow> dataFlows = ParseUtil.lookupDataFlows(nativeModel);

            // Query the native model and set the threat model object with the values
            threatModel.assumptions(nativeModel.getMetaInformation().getAssumptions())
                    .contributors(nativeModel.getMetaInformation().getContributors())
                    .description(nativeModel.getMetaInformation().getHighLevelSystemDescription())
                    .name(nativeModel.getMetaInformation().getThreatModelName())
                    .owner(nativeModel.getMetaInformation().getOwner())
                    .reviewer(nativeModel.getMetaInformation().getReviewer())
                    .assets(assets)
                    .dataFlows(dataFlows);

            List<Threat> threats = new ArrayList<>();
            List<HashMap<String, ThreatInstance>> threatList = nativeModel.getKeyValueThreatMap();
            for (HashMap<String, ThreatInstance> threatMap: threatList) {
                for (Map.Entry<String, ThreatInstance> threatEntry : threatMap.entrySet()) {
                    ThreatInstance ti = threatEntry.getValue();
                    ThreatType threatType = ParseUtil.lookupThreatType(nativeModel, ti);

                    Threat threat = new Threat()
                            .id(ti.getId())
                            .name(ParseUtil.lookupPropertyValueByKey(ti, "Title"))
                            .description(ParseUtil.lookupPropertyValueByKey(ti, "UserThreatDescription"))
                            .justification(ParseUtil.lookupPropertyValueByKey(ti, "StateInformation"))
                            .threatClassification(ParseUtil.lookupClassification(threatType))
                            .risk(ParseUtil.lookupRisk(ti))
                            .state(ParseUtil.lookupState(ti))
                            .dataFlow(ParseUtil.lookupAssociatedDataFlows(assets,dataFlows, ti))
                            .assets(ParseUtil.lookupTargetAsset(assets, ti));

                    //todo: complete model normalization
                    //todo: add CWE and CAPEC mappings

                    threats.add(threat);
                }
                threatModel.setThreats(threats);
            }
            return threatModel;

        } catch (JAXBException | XMLStreamException e) {
            throw new ParseException(e);
        }
    }

}
