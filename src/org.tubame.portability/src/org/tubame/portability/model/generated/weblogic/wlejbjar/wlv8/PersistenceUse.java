//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.17 at 10:51:37 AM JST 
//

package org.tubame.portability.model.generated.weblogic.wlejbjar.wlv8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "typeIdentifier", "typeVersion",
        "typeStorage" })
@XmlRootElement(name = "persistence-use")
public class PersistenceUse {

    @XmlElement(name = "type-identifier", required = true)
    protected String typeIdentifier;
    @XmlElement(name = "type-version", required = true)
    protected String typeVersion;
    @XmlElement(name = "type-storage", required = true)
    protected String typeStorage;

    /**
     * Gets the value of the typeIdentifier property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTypeIdentifier() {
        return typeIdentifier;
    }

    /**
     * Sets the value of the typeIdentifier property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setTypeIdentifier(String value) {
        this.typeIdentifier = value;
    }

    /**
     * Gets the value of the typeVersion property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTypeVersion() {
        return typeVersion;
    }

    /**
     * Sets the value of the typeVersion property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setTypeVersion(String value) {
        this.typeVersion = value;
    }

    /**
     * Gets the value of the typeStorage property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTypeStorage() {
        return typeStorage;
    }

    /**
     * Sets the value of the typeStorage property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setTypeStorage(String value) {
        this.typeStorage = value;
    }

}
