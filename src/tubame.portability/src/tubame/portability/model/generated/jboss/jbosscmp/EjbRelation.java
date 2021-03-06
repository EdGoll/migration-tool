//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.17 at 10:51:29 AM JST 
//

package tubame.portability.model.generated.jboss.jbosscmp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "ejbRelationName", "readOnly", "readTimeOut",
        "foreignKeyMappingOrRelationTableMapping", "ejbRelationshipRole" })
@XmlRootElement(name = "ejb-relation")
public class EjbRelation {

    @XmlElement(name = "ejb-relation-name", required = true)
    protected String ejbRelationName;
    @XmlElement(name = "read-only")
    protected String readOnly;
    @XmlElement(name = "read-time-out")
    protected String readTimeOut;
    @XmlElements({
            @XmlElement(name = "foreign-key-mapping", type = ForeignKeyMapping.class),
            @XmlElement(name = "relation-table-mapping", type = RelationTableMapping.class) })
    protected List<Object> foreignKeyMappingOrRelationTableMapping;
    @XmlElement(name = "ejb-relationship-role")
    protected List<EjbRelationshipRole> ejbRelationshipRole;

    /**
     * Gets the value of the ejbRelationName property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getEjbRelationName() {
        return ejbRelationName;
    }

    /**
     * Sets the value of the ejbRelationName property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setEjbRelationName(String value) {
        this.ejbRelationName = value;
    }

    /**
     * Gets the value of the readOnly property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getReadOnly() {
        return readOnly;
    }

    /**
     * Sets the value of the readOnly property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setReadOnly(String value) {
        this.readOnly = value;
    }

    /**
     * Gets the value of the readTimeOut property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getReadTimeOut() {
        return readTimeOut;
    }

    /**
     * Sets the value of the readTimeOut property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setReadTimeOut(String value) {
        this.readTimeOut = value;
    }

    /**
     * Gets the value of the foreignKeyMappingOrRelationTableMapping property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the foreignKeyMappingOrRelationTableMapping
     * property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getForeignKeyMappingOrRelationTableMapping().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ForeignKeyMapping } {@link RelationTableMapping }
     * 
     * 
     */
    public List<Object> getForeignKeyMappingOrRelationTableMapping() {
        if (foreignKeyMappingOrRelationTableMapping == null) {
            foreignKeyMappingOrRelationTableMapping = new ArrayList<Object>();
        }
        return this.foreignKeyMappingOrRelationTableMapping;
    }

    /**
     * Gets the value of the ejbRelationshipRole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the ejbRelationshipRole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getEjbRelationshipRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EjbRelationshipRole }
     * 
     * 
     */
    public List<EjbRelationshipRole> getEjbRelationshipRole() {
        if (ejbRelationshipRole == null) {
            ejbRelationshipRole = new ArrayList<EjbRelationshipRole>();
        }
        return this.ejbRelationshipRole;
    }

}
