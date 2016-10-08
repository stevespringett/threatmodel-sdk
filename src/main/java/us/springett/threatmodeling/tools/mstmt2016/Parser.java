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
import us.springett.threatmodeling.model.Risk;
import us.springett.threatmodeling.model.Stride;
import us.springett.threatmodeling.model.Threat;
import us.springett.threatmodeling.model.ThreatModel;
import us.springett.threatmodeling.tools.mstmt2016.model.ThreatInstance;
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

            // Query the native model and set the threat model object with the values
            threatModel.setAssumptions(nativeModel.getMetaInformation().getAssumptions());
            threatModel.setContributors(nativeModel.getMetaInformation().getContributors());
            threatModel.setDescription(nativeModel.getMetaInformation().getHighLevelSystemDescription());
            threatModel.setName(nativeModel.getMetaInformation().getThreatModelName());
            threatModel.setOwner(nativeModel.getMetaInformation().getOwner());
            threatModel.setReviewer(nativeModel.getMetaInformation().getReviewer());

            List<Threat> threats = new ArrayList<Threat>();
            List<HashMap<String, ThreatInstance>> threatList = nativeModel.getKeyValueThreatMap();
            for (HashMap<String, ThreatInstance> threatMap: threatList) {
                for (Map.Entry<String, ThreatInstance> threatEntry : threatMap.entrySet()) {
                    Threat threat = new Threat();
                    threat.setId(threatEntry.getKey());
                    ThreatInstance ti = threatEntry.getValue();
                    threat.setId(ti.getId());

                    if ("High".equals(ti.getPriority())) {
                        threat.setRisk(Risk.HIGH);
                    } else if ("Medium".equals(ti.getPriority())) {
                        threat.setRisk(Risk.MEDIUM);
                    } else if ("Low".equals(ti.getPriority())) {
                        threat.setRisk(Risk.LOW);
                    }
                    threat.setMitigated("Mitigated".equals(ti.getState()));

                    if (ti.getTypeId().startsWith("S")) {
                        threat.setThreatClassification(Stride.SPOOFING);
                    } else if (ti.getTypeId().startsWith("T")) {
                            threat.setThreatClassification(Stride.TAMPERING);
                    } else if (ti.getTypeId().startsWith("R")) {
                        threat.setThreatClassification(Stride.REPUDIATION);
                    } else if (ti.getTypeId().startsWith("I")) {
                        threat.setThreatClassification(Stride.INFORMATION_DISCLOSURE);
                    } else if (ti.getTypeId().startsWith("D")) {
                        threat.setThreatClassification(Stride.DENIAL_OF_SERVICE);
                    } else if (ti.getTypeId().startsWith("E")) {
                        threat.setThreatClassification(Stride.ELEVATION_OF_PRIVILEGE);
                    } else if (ti.getTypeId().startsWith("A")) {
                        threat.setThreatClassification(Stride.ABUSE);
                    } else {
                        System.out.println("other");
                    }

                    //todo: complete model normalization

                    //System.out.println(threat);

                }
            }

            return threatModel;

        } catch (JAXBException | XMLStreamException e) {
            throw new ParseException(e);
        }
    }

}
