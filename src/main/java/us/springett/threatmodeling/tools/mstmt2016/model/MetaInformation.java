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
