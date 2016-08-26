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
import java.util.List;

@XmlRootElement(name = "StandardElements", namespace = "http://schemas.datacontract.org/2004/07/ThreatModeling.KnowledgeBase")
public class StandardElements {

    private List<ElementType> elementTypes;

    public List<ElementType> getElementTypes() {
        return elementTypes;
    }

    @XmlElement(name = "ElementType")
    public void setElementTypes(List<ElementType> elementTypes) {
        this.elementTypes = elementTypes;
    }
}
