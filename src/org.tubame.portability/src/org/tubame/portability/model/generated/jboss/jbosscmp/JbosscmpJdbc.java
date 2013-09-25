//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.17 at 10:51:29 AM JST 
//

package org.tubame.portability.model.generated.jboss.jbosscmp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "defaults", "enterpriseBeans",
        "relationships", "dependentValueClasses", "typeMappings",
        "entityCommands", "userTypeMappings", "reservedWords" })
@XmlRootElement(name = "jbosscmp-jdbc")
public class JbosscmpJdbc {

    protected Defaults defaults;
    @XmlElement(name = "enterprise-beans")
    protected EnterpriseBeans enterpriseBeans;
    protected Relationships relationships;
    @XmlElement(name = "dependent-value-classes")
    protected DependentValueClasses dependentValueClasses;
    @XmlElement(name = "type-mappings")
    protected TypeMappings typeMappings;
    @XmlElement(name = "entity-commands")
    protected EntityCommands entityCommands;
    @XmlElement(name = "user-type-mappings")
    protected UserTypeMappings userTypeMappings;
    @XmlElement(name = "reserved-words")
    protected ReservedWords reservedWords;

    /**
     * Gets the value of the defaults property.
     * 
     * @return possible object is {@link Defaults }
     * 
     */
    public Defaults getDefaults() {
        return defaults;
    }

    /**
     * Sets the value of the defaults property.
     * 
     * @param value
     *            allowed object is {@link Defaults }
     * 
     */
    public void setDefaults(Defaults value) {
        this.defaults = value;
    }

    /**
     * Gets the value of the enterpriseBeans property.
     * 
     * @return possible object is {@link EnterpriseBeans }
     * 
     */
    public EnterpriseBeans getEnterpriseBeans() {
        return enterpriseBeans;
    }

    /**
     * Sets the value of the enterpriseBeans property.
     * 
     * @param value
     *            allowed object is {@link EnterpriseBeans }
     * 
     */
    public void setEnterpriseBeans(EnterpriseBeans value) {
        this.enterpriseBeans = value;
    }

    /**
     * Gets the value of the relationships property.
     * 
     * @return possible object is {@link Relationships }
     * 
     */
    public Relationships getRelationships() {
        return relationships;
    }

    /**
     * Sets the value of the relationships property.
     * 
     * @param value
     *            allowed object is {@link Relationships }
     * 
     */
    public void setRelationships(Relationships value) {
        this.relationships = value;
    }

    /**
     * Gets the value of the dependentValueClasses property.
     * 
     * @return possible object is {@link DependentValueClasses }
     * 
     */
    public DependentValueClasses getDependentValueClasses() {
        return dependentValueClasses;
    }

    /**
     * Sets the value of the dependentValueClasses property.
     * 
     * @param value
     *            allowed object is {@link DependentValueClasses }
     * 
     */
    public void setDependentValueClasses(DependentValueClasses value) {
        this.dependentValueClasses = value;
    }

    /**
     * Gets the value of the typeMappings property.
     * 
     * @return possible object is {@link TypeMappings }
     * 
     */
    public TypeMappings getTypeMappings() {
        return typeMappings;
    }

    /**
     * Sets the value of the typeMappings property.
     * 
     * @param value
     *            allowed object is {@link TypeMappings }
     * 
     */
    public void setTypeMappings(TypeMappings value) {
        this.typeMappings = value;
    }

    /**
     * Gets the value of the entityCommands property.
     * 
     * @return possible object is {@link EntityCommands }
     * 
     */
    public EntityCommands getEntityCommands() {
        return entityCommands;
    }

    /**
     * Sets the value of the entityCommands property.
     * 
     * @param value
     *            allowed object is {@link EntityCommands }
     * 
     */
    public void setEntityCommands(EntityCommands value) {
        this.entityCommands = value;
    }

    /**
     * Gets the value of the userTypeMappings property.
     * 
     * @return possible object is {@link UserTypeMappings }
     * 
     */
    public UserTypeMappings getUserTypeMappings() {
        return userTypeMappings;
    }

    /**
     * Sets the value of the userTypeMappings property.
     * 
     * @param value
     *            allowed object is {@link UserTypeMappings }
     * 
     */
    public void setUserTypeMappings(UserTypeMappings value) {
        this.userTypeMappings = value;
    }

    /**
     * Gets the value of the reservedWords property.
     * 
     * @return possible object is {@link ReservedWords }
     * 
     */
    public ReservedWords getReservedWords() {
        return reservedWords;
    }

    /**
     * Sets the value of the reservedWords property.
     * 
     * @param value
     *            allowed object is {@link ReservedWords }
     * 
     */
    public void setReservedWords(ReservedWords value) {
        this.reservedWords = value;
    }

}
