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

@XmlRootElement(name = "ThreatType", namespace = "http://schemas.datacontract.org/2004/07/ThreatModeling.KnowledgeBase")
public class ThreatType {

    private boolean isExtension;
    private String category;
    private String description;
    private GenerationFilters generationFilters;
    private String id;
    private PropertiesMetaData propertiesMetaData;
    private String shortTitle;

    public boolean isExtension() {
        return isExtension;
    }

    @XmlElement(name = "IsExtension")
    public void setExtension(boolean extension) {
        isExtension = extension;
    }

    public String getCategory() {
        return category;
    }

    @XmlElement(name = "Category")
    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    @XmlElement(name = "Description")
    public void setDescription(String description) {
        this.description = description;
    }

    public GenerationFilters getGenerationFilters() {
        return this.generationFilters;
    }

    @XmlElement(name = "GenerationFilters")
    public void setGenerationFilters(GenerationFilters generationFilters) {
        this.generationFilters = generationFilters;
    }

    public String getId() {
        return id;
    }

    @XmlElement(name = "Id")
    public void setId(String id) {
        this.id = id;
    }

    public PropertiesMetaData getPropertiesMetaData() {
        return propertiesMetaData;
    }

    @XmlElement(name = "PropertiesMetaData")
    public void setPropertiesMetaData(PropertiesMetaData propertiesMetaData) {
        this.propertiesMetaData = propertiesMetaData;
    }

    public String getShortTitle() {
        return shortTitle;
    }

    @XmlElement(name = "ShortTitle")
    public void setShortTitle(String shortTitle) {
        this.shortTitle = shortTitle;
    }
}
