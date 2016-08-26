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

@XmlRootElement(name = "ThreatCategory", namespace = "http://schemas.datacontract.org/2004/07/ThreatModeling.KnowledgeBase")
public class ThreatCategory {

    private boolean isExtension;
    private String id;
    private String longDescription;
    private String name;
    private String shortDescription;

    public boolean isExtension() {
        return isExtension;
    }

    @XmlElement(name = "IsExtension")
    public void setExtension(boolean extension) {
        isExtension = extension;
    }

    public String getId() {
        return id;
    }

    @XmlElement(name = "Id")
    public void setId(String id) {
        this.id = id;
    }

    public String getLongDescription() {
        return longDescription;
    }

    @XmlElement(name = "LongDescription")
    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public String getName() {
        return name;
    }

    @XmlElement(name = "Name")
    public void setName(String name) {
        this.name = name;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    @XmlElement(name = "ShortDescription")
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }
}
