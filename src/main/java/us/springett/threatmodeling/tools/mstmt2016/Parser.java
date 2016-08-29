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
import us.springett.threatmodeling.model.Threat;
import us.springett.threatmodeling.model.ThreatModel;
import us.springett.threatmodeling.tools.mstmt2016.model.ThreatInstance;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.*;

public final class Parser implements IParser {

    public ThreatModel parse(File file) throws ParseException {
        try {
            // Parse the native threat model
            JAXBContext jaxbContext = JAXBContext.newInstance(us.springett.threatmodeling.tools.mstmt2016.model.ThreatModel.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            us.springett.threatmodeling.tools.mstmt2016.model.ThreatModel nativeModel =
                    (us.springett.threatmodeling.tools.mstmt2016.model.ThreatModel) unmarshaller.unmarshal(file);

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
                    threat.setName(ti.getId());

                    //threat.
                    //threat.setMitigated(ti.getState().equals("Mitigated"));



                    //System.out.println(threat);

                }
            }

            return threatModel;

        } catch (JAXBException e) {
            throw new ParseException(e);
        }
    }

}
