//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.17 at 10:51:27 AM JST 
//

package tubame.portability.model.generated.weblogic.wlcmp.wlv5;

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
@XmlType(name = "", propOrder = { "objectLink" })
@XmlRootElement(name = "attribute-map")
public class AttributeMap {

    @XmlElement(name = "object-link")
    protected List<ObjectLink> objectLink;

    /**
     * Gets the value of the objectLink property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the objectLink property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getObjectLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectLink }
     * 
     * 
     */
    public List<ObjectLink> getObjectLink() {
        if (objectLink == null) {
            objectLink = new ArrayList<ObjectLink>();
        }
        return this.objectLink;
    }

}
