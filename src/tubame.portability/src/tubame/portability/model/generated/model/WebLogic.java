//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.22 at 11:30:08 AM JST 
//

package tubame.portability.model.generated.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for webLogic.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="webLogic">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="V8"/>
 *     &lt;enumeration value="V6"/>
 *     &lt;enumeration value="V5"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "webLogic")
@XmlEnum
public enum WebLogic {

    @XmlEnumValue("V8")
    V_8("V8"), @XmlEnumValue("V6")
    V_6("V6"), @XmlEnumValue("V5")
    V_5("V5");
    private final String value;

    WebLogic(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WebLogic fromValue(String v) {
        for (WebLogic c : WebLogic.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
