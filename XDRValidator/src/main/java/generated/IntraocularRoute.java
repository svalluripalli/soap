//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.07 at 05:07:17 PM EDT 
//


package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntraocularRoute.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IntraocularRoute">
 *   &lt;restriction base="{}cs">
 *     &lt;enumeration value="IOINJ"/>
 *     &lt;enumeration value="IOSURGINS"/>
 *     &lt;enumeration value="IOINSTL"/>
 *     &lt;enumeration value="IOIRR"/>
 *     &lt;enumeration value="IOTOP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IntraocularRoute")
@XmlEnum
public enum IntraocularRoute {

    IOINJ,
    IOSURGINS,
    IOINSTL,
    IOIRR,
    IOTOP;

    public String value() {
        return name();
    }

    public static IntraocularRoute fromValue(String v) {
        return valueOf(v);
    }

}
