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
