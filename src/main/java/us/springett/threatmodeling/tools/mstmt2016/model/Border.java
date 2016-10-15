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

@XmlRootElement(name = "KeyValueOfguidanyType", namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays")
public class Border {

    private String key;
    private Value value;

    public String getKey() {
        return key;
    }

    @XmlElement(name = "Key", namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays")
    public void setKey(String key) {
        this.key = key;
    }

    public Value getValue() {
        return value;
    }

    @XmlElement(name = "Value", namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays")
    public void setValue(Value value) {
        this.value = value;
    }

    @XmlRootElement(name = "Value", namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays")
    public static class Value {

        private String genericTypeId;
        private List<AnyType> anyTypes;

        public String getGenericTypeId() {
            return genericTypeId;
        }

        @XmlElement(name = "GenericTypeId", namespace = "http://schemas.datacontract.org/2004/07/ThreatModeling.Model.Abstracts")
        public void setGenericTypeId(String genericTypeId) {
            this.genericTypeId = genericTypeId;
        }

        public List<AnyType> getAnyTypes() {
            return anyTypes;
        }

        @XmlElementWrapper(name = "Properties", namespace = "http://schemas.datacontract.org/2004/07/ThreatModeling.Model.Abstracts")
        @XmlElement(name = "anyType", namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays")
        public void setAnyTypes(List<AnyType> anyTypes) {
            this.anyTypes = anyTypes;
        }
    }

    @XmlRootElement(name = "anyType", namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays")
    public static class AnyType {

        private String displayName;
        private String name;
        private String value;

        public String getDisplayName() {
            return displayName;
        }

        @XmlElement(name = "DisplayName", namespace = "http://schemas.datacontract.org/2004/07/ThreatModeling.KnowledgeBase")
        public void setDisplayName(String displayName) {
            this.displayName = displayName;
        }

        public String getName() {
            return name;
        }

        @XmlElement(name = "Name", namespace = "http://schemas.datacontract.org/2004/07/ThreatModeling.KnowledgeBase")
        public void setName(String name) {
            this.name = name;
        }

        public String getValue() {
            return value;
        }

        @XmlElement(name = "Value", namespace = "http://schemas.datacontract.org/2004/07/ThreatModeling.KnowledgeBase")
        public void setValue(String value) {
            this.value = value;
        }
    }
}
