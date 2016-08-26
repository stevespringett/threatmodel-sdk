/*
 * This file is part of the ThreatModeling SDK.
 *
 * ThreatModeling SDK is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by the
 * Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 *
 * ThreatModeling SDK is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for
 * more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * ThreatModeling SDK. If not, see http://www.gnu.org/licenses/.
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
