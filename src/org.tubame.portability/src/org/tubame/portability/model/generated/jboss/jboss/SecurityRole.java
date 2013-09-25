//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.17 at 10:51:38 AM JST 
//

package org.tubame.portability.model.generated.jboss.jboss;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "roleName", "principalName" })
@XmlRootElement(name = "security-role")
public class SecurityRole {

    @XmlElement(name = "role-name", required = true)
    protected String roleName;
    @XmlElement(name = "principal-name", required = true)
    protected List<PrincipalName> principalName;

    /**
     * Gets the value of the roleName property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * Sets the value of the roleName property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setRoleName(String value) {
        this.roleName = value;
    }

    /**
     * Gets the value of the principalName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the principalName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getPrincipalName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrincipalName }
     * 
     * 
     */
    public List<PrincipalName> getPrincipalName() {
        if (principalName == null) {
            principalName = new ArrayList<PrincipalName>();
        }
        return this.principalName;
    }

}
