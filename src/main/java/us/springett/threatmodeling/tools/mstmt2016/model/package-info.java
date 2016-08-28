@XmlSchema(
        namespace = "http://schemas.datacontract.org/2004/07/ThreatModeling.Model",
        elementFormDefault = XmlNsForm.QUALIFIED,
        xmlns = {
                @XmlNs(prefix="i", namespaceURI="http://www.w3.org/2001/XMLSchema-instance")
        }
)

package us.springett.threatmodeling.tools.mstmt2016.model;
import javax.xml.bind.annotation.XmlSchema;
import javax.xml.bind.annotation.XmlNsForm;
import javax.xml.bind.annotation.XmlNs;