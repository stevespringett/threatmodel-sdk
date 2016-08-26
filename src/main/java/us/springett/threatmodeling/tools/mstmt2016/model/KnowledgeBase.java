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

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "KnowledgeBase")
public class KnowledgeBase {

    private GenericElements genericElements;
    private Manifest manifest;
    private StandardElements standardElements;
    private List<ThreatCategory> threatCategories;
    private ThreatMetaData threatMetaData;
    private List<ThreatType> threatTypes;


    public GenericElements getGenericElements() {
        return genericElements;
    }

    @XmlElement(name = "GenericElements", namespace = "http://schemas.datacontract.org/2004/07/ThreatModeling.KnowledgeBase")
    public void setGenericElements(GenericElements genericElements) {
        this.genericElements = genericElements;
    }

    public Manifest getManifest() {
        return manifest;
    }

    @XmlElement(name = "Manifest", namespace = "http://schemas.datacontract.org/2004/07/ThreatModeling.KnowledgeBase")
    public void setManifest(Manifest manifest) {
        this.manifest = manifest;
    }

    public StandardElements getStandardElements() {
        return standardElements;
    }

    @XmlElement(name = "StandardElements", namespace = "http://schemas.datacontract.org/2004/07/ThreatModeling.KnowledgeBase")
    public void setStandardElements(StandardElements standardElements) {
        this.standardElements = standardElements;
    }

    public List<ThreatCategory> getThreatCategories() {
        return threatCategories;
    }

    @XmlElementWrapper(name = "ThreatCategories", namespace = "http://schemas.datacontract.org/2004/07/ThreatModeling.KnowledgeBase")
    @XmlElement(name = "ThreatCategory", namespace = "http://schemas.datacontract.org/2004/07/ThreatModeling.KnowledgeBase")
    public void setThreatCategories(List<ThreatCategory> threatCategories) {
        this.threatCategories = threatCategories;
    }

    public ThreatMetaData getThreatMetaData() {
        return threatMetaData;
    }

    @XmlElement(name = "ThreatMetaData")
    public void setThreatMetaData(ThreatMetaData threatMetaData) {
        this.threatMetaData = threatMetaData;
    }

    public List<ThreatType> getThreatTypes() {
        return threatTypes;
    }

    @XmlElementWrapper(name = "ThreatTypes", namespace = "http://schemas.datacontract.org/2004/07/ThreatModeling.KnowledgeBase")
    @XmlElement(name = "ThreatType", namespace = "http://schemas.datacontract.org/2004/07/ThreatModeling.KnowledgeBase")
    public void setThreatTypes(List<ThreatType> threatTypes) {
        this.threatTypes = threatTypes;
    }
}
