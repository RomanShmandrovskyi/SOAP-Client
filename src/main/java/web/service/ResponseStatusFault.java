
package web.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for responseStatusFault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="responseStatusFault">
 *   &lt;complexContent>
 *     &lt;extension base="{http://service.web/}responseStatus">
 *       &lt;sequence>
 *         &lt;element name="faultStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responseStatusFault", propOrder = {
    "faultStatus"
})
public class ResponseStatusFault
    extends ResponseStatus
{

    protected String faultStatus;

    /**
     * Gets the value of the faultStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaultStatus() {
        return faultStatus;
    }

    /**
     * Sets the value of the faultStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaultStatus(String value) {
        this.faultStatus = value;
    }

}
