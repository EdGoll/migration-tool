//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.17 at 10:51:36 AM JST 
//

package org.tubame.portability.model.generated.weblogic.wlejbjar.wlv6;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "transTimeoutSeconds" })
@XmlRootElement(name = "transaction-descriptor")
public class TransactionDescriptor {

    @XmlElement(name = "trans-timeout-seconds")
    protected String transTimeoutSeconds;

    /**
     * Gets the value of the transTimeoutSeconds property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTransTimeoutSeconds() {
        return transTimeoutSeconds;
    }

    /**
     * Sets the value of the transTimeoutSeconds property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setTransTimeoutSeconds(String value) {
        this.transTimeoutSeconds = value;
    }

}
