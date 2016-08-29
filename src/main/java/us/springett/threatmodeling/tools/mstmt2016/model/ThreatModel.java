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
package us.springett.threatmodeling.tools.mstmt2016.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.HashMap;
import java.util.List;

@XmlRootElement(name = "ThreatModel", namespace = "http://schemas.datacontract.org/2004/07/ThreatModeling.Model")
public class ThreatModel {

    private MetaInformation metaInformation;
    private List<HashMap<String, ThreatInstance>> threatInstances;
    private KnowledgeBase knowledgeBase;
    private String notes;
    private String version;

    public MetaInformation getMetaInformation() {
        return metaInformation;
    }

    @XmlElement(name = "MetaInformation")
    public void setMetaInformation(MetaInformation metaInformation) {
        this.metaInformation = metaInformation;
    }

    public List<HashMap<String, ThreatInstance>> getKeyValueThreatMap() {
        return threatInstances;
    }

    @XmlElementWrapper(name = "ThreatInstances")
    @XmlElement(name = "KeyValueOfstringThreatpc_P0_PhOB", namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays")
    @XmlJavaTypeAdapter(ThreatMapAdapter.class)
    public void setKeyValueThreatMap(List<HashMap<String, ThreatInstance>> threatInstances) {
        this.threatInstances = threatInstances;
    }

    public KnowledgeBase getKnowledgeBase() {
        return knowledgeBase;
    }

    @XmlElement(name = "KnowledgeBase")
    public void setKnowledgeBase(KnowledgeBase knowledgeBase) {
        this.knowledgeBase = knowledgeBase;
    }

    public String getNotes() {
        return notes;
    }

    @XmlElement(name = "Notes")
    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getVersion() {
        return version;
    }

    @XmlElement(name = "Version")
    public void setVersion(String version) {
        this.version = version;
    }
}
