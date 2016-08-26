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
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ElementType", namespace = "http://schemas.datacontract.org/2004/07/ThreatModeling.KnowledgeBase")
public class ElementType {

    private boolean isExtension;
    private String description;
    private boolean hidden;
    private String id;
    private String name;
    private String parentId;
    private String representation;

    public boolean isExtension() {
        return isExtension;
    }

    @XmlElement(name = "isExtension")
    public void setExtension(boolean extension) {
        isExtension = extension;
    }

    public String getDescription() {
        return description;
    }

    @XmlElement(name = "isExtension")
    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isHidden() {
        return hidden;
    }

    @XmlElement(name = "hidden")
    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    public String getId() {
        return id;
    }

    @XmlElement(name = "Id")
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @XmlElement(name = "Name")
    public void setName(String name) {
        this.name = name;
    }

    public String getParentId() {
        return parentId;
    }

    @XmlElement(name = "ParentId")
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getRepresentation() {
        return representation;
    }

    @XmlElement(name = "Representation")
    public void setRepresentation(String representation) {
        this.representation = representation;
    }
}
