//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.22 at 11:30:08 AM JST 
//

package tubame.portability.model.generated.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for convertType.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="convertType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ALL"/>
 *     &lt;enumeration value="EJB_JAR_XML_CONVERT"/>
 *     &lt;enumeration value="EJB_CMP_XML_CONVERT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "convertType")
@XmlEnum
public enum ConvertType {

    ALL, EJB_JAR_XML_CONVERT, EJB_CMP_XML_CONVERT;

    public String value() {
        return name();
    }

    public static ConvertType fromValue(String v) {
        return valueOf(v);
    }

}