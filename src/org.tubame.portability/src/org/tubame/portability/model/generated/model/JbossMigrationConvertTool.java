//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.22 at 11:30:08 AM JST 
//

package org.tubame.portability.model.generated.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="migrationItems" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="migrationItem" type="{}migrationItem" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "migrationItems" })
@XmlRootElement(name = "jbossMigrationConvertTool")
public class JbossMigrationConvertTool {

    protected JbossMigrationConvertTool.MigrationItems migrationItems;

    /**
     * Gets the value of the migrationItems property.
     * 
     * @return possible object is
     *         {@link JbossMigrationConvertTool.MigrationItems }
     * 
     */
    public JbossMigrationConvertTool.MigrationItems getMigrationItems() {
        return migrationItems;
    }

    /**
     * Sets the value of the migrationItems property.
     * 
     * @param value
     *            allowed object is
     *            {@link JbossMigrationConvertTool.MigrationItems }
     * 
     */
    public void setMigrationItems(JbossMigrationConvertTool.MigrationItems value) {
        this.migrationItems = value;
    }

    /**
     * <p>
     * Java class for anonymous complex type.
     * 
     * <p>
     * The following schema fragment specifies the expected content contained
     * within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="migrationItem" type="{}migrationItem" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "migrationItem" })
    public static class MigrationItems {

        protected List<MigrationItem> migrationItem;

        /**
         * Gets the value of the migrationItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list, not a
         * snapshot. Therefore any modification you make to the returned list
         * will be present inside the JAXB object. This is why there is not a
         * <CODE>set</CODE> method for the migrationItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * 
         * <pre>
         * getMigrationItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MigrationItem }
         * 
         * 
         */
        public List<MigrationItem> getMigrationItem() {
            if (migrationItem == null) {
                migrationItem = new ArrayList<MigrationItem>();
            }
            return this.migrationItem;
        }

    }

}