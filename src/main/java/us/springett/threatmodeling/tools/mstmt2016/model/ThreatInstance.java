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
import java.util.Date;
import java.util.List;
import java.util.Map;

@XmlRootElement(name = "Value", namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays")
public class ThreatInstance {

    private String changedBy;
    private String drawingSurfaceGuid;
    private String flowGuid;
    private String id;
    private String interactionKey;
    private Date modifiedAt;
    private String priority;
    private List<Map<String, String>> properties;
    private String sourceGuid;
    private String state;
    private String targetGuid;
    private String typeId;
    private String upgraded;
    private String wide;

    public String getChangedBy() {
        return changedBy;
    }

    @XmlElement(name = "ChangedBy", namespace = "http://schemas.datacontract.org/2004/07/ThreatModeling.KnowledgeBase")
    public void setChangedBy(String changedBy) {
        this.changedBy = changedBy;
    }

    public String getDrawingSurfaceGuid() {
        return drawingSurfaceGuid;
    }

    @XmlElement(name = "DrawingSurfaceGuid", namespace = "http://schemas.datacontract.org/2004/07/ThreatModeling.KnowledgeBase")
    public void setDrawingSurfaceGuid(String drawingSurfaceGuid) {
        this.drawingSurfaceGuid = drawingSurfaceGuid;
    }

    public String getFlowGuid() {
        return flowGuid;
    }

    @XmlElement(name = "FlowGuid", namespace = "http://schemas.datacontract.org/2004/07/ThreatModeling.KnowledgeBase")
    public void setFlowGuid(String flowGuid) {
        this.flowGuid = flowGuid;
    }

    public String getId() {
        return id;
    }

    @XmlElement(name = "Id", namespace = "http://schemas.datacontract.org/2004/07/ThreatModeling.KnowledgeBase")
    public void setId(String id) {
        this.id = id;
    }

    public String getInteractionKey() {
        return interactionKey;
    }

    @XmlElement(name = "InteractionKey", namespace = "http://schemas.datacontract.org/2004/07/ThreatModeling.KnowledgeBase")
    public void setInteractionKey(String interactionKey) {
        this.interactionKey = interactionKey;
    }

    public Date getModifiedAt() {
        return modifiedAt;
    }

    @XmlElement(name = "ModifiedAt", namespace = "http://schemas.datacontract.org/2004/07/ThreatModeling.KnowledgeBase")
    public void setModifiedAt(Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public String getPriority() {
        return priority;
    }

    @XmlElement(name = "Priority", namespace = "http://schemas.datacontract.org/2004/07/ThreatModeling.KnowledgeBase")
    public void setPriority(String priority) {
        this.priority = priority;
    }

    public List<Map<String, String>> getProperties() {
        return properties;
    }

    @XmlElementWrapper(name = "Properties")
    @XmlElement(name = "KeyValueOfstringstring", namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays")
    @XmlJavaTypeAdapter(ThreatPropertyMapAdapter.class)
    public void setProperties(List<Map<String, String>> properties) {
        this.properties = properties;
    }

    public String getSourceGuid() {
        return sourceGuid;
    }

    @XmlElement(name = "SourceGuid", namespace = "http://schemas.datacontract.org/2004/07/ThreatModeling.KnowledgeBase")
    public void setSourceGuid(String sourceGuid) {
        this.sourceGuid = sourceGuid;
    }

    public String getState() {
        return state;
    }

    @XmlElement(name = "State", namespace = "http://schemas.datacontract.org/2004/07/ThreatModeling.KnowledgeBase")
    public void setState(String state) {
        this.state = state;
    }

    public String getTargetGuid() {
        return targetGuid;
    }

    @XmlElement(name = "TargetGuid", namespace = "http://schemas.datacontract.org/2004/07/ThreatModeling.KnowledgeBase")
    public void setTargetGuid(String targetGuid) {
        this.targetGuid = targetGuid;
    }

    public String getTypeId() {
        return typeId;
    }

    @XmlElement(name = "TypeId", namespace = "http://schemas.datacontract.org/2004/07/ThreatModeling.KnowledgeBase")
    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getUpgraded() {
        return upgraded;
    }

    @XmlElement(name = "Upgraded", namespace = "http://schemas.datacontract.org/2004/07/ThreatModeling.KnowledgeBase")
    public void setUpgraded(String upgraded) {
        this.upgraded = upgraded;
    }

    public String getWide() {
        return wide;
    }

    @XmlElement(name = "Wide", namespace = "http://schemas.datacontract.org/2004/07/ThreatModeling.KnowledgeBase")
    public void setWide(String wide) {
        this.wide = wide;
    }
}
