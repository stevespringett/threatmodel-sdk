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
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Manifest", namespace = "http://schemas.datacontract.org/2004/07/ThreatModeling.KnowledgeBase")
public class Manifest {

    private String author;
    private String id;
    private String name;
    private String version;

    public String getAuthor() {
        return author;
    }

    @XmlElement(name = "Author")
    public void setAuthor(String author) {
        this.author = author;
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

    public String getVersion() {
        return version;
    }

    @XmlElement(name = "Version")
    public void setVersion(String version) {
        this.version = version;
    }
}
