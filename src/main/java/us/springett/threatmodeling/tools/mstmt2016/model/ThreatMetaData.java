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

@XmlRootElement(name = "ThreatMetaData", namespace = "http://schemas.datacontract.org/2004/07/ThreatModeling.KnowledgeBase")
public class ThreatMetaData {

    private boolean isPriorityUsed;
    private boolean isStatusUsed;
    private PropertiesMetaData propertiesMetaData;

    public boolean isPriorityUsed() {
        return isPriorityUsed;
    }

    @XmlElement(name = "isPriorityUsed")
    public void setPriorityUsed(boolean priorityUsed) {
        isPriorityUsed = priorityUsed;
    }

    public boolean isStatusUsed() {
        return isStatusUsed;
    }

    @XmlElement(name = "isStatusUsed")
    public void setStatusUsed(boolean statusUsed) {
        isStatusUsed = statusUsed;
    }

    public PropertiesMetaData getPropertiesMetaData() {
        return propertiesMetaData;
    }

    @XmlElement(name = "PropertiesMetaData")
    public void setPropertiesMetaData(PropertiesMetaData propertiesMetaData) {
        this.propertiesMetaData = propertiesMetaData;
    }
}
