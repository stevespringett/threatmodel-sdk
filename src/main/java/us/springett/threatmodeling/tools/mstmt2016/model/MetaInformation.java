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

@XmlRootElement(name = "MetaInformation")
public class MetaInformation {

    private String assumptions;
    private String contributors;
    private String externalDependencies;
    private String highLevelSystemDescription;
    private String owner;
    private String reviewer;
    private String threatModelName;

    public String getAssumptions() {
        return assumptions;
    }

    @XmlElement(name = "Assumptions")
    public void setAssumptions(String assumptions) {
        this.assumptions = assumptions;
    }

    public String getContributors() {
        return contributors;
    }

    @XmlElement(name = "Contributors")
    public void setContributors(String contributors) {
        this.contributors = contributors;
    }

    public String getExternalDependencies() {
        return externalDependencies;
    }

    @XmlElement(name = "ExternalDependencies")
    public void setExternalDependencies(String externalDependencies) {
        this.externalDependencies = externalDependencies;
    }

    public String getHighLevelSystemDescription() {
        return highLevelSystemDescription;
    }

    @XmlElement(name = "HighLevelSystemDescription")
    public void setHighLevelSystemDescription(String highLevelSystemDescription) {
        this.highLevelSystemDescription = highLevelSystemDescription;
    }

    public String getOwner() {
        return owner;
    }

    @XmlElement(name = "Owner")
    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getReviewer() {
        return reviewer;
    }

    @XmlElement(name = "Reviewer")
    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public String getThreatModelName() {
        return threatModelName;
    }

    @XmlElement(name = "ThreatModelName")
    public void setThreatModelName(String threatModelName) {
        this.threatModelName = threatModelName;
    }
}
