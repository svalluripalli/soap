//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.07 at 05:07:17 PM EDT 
//


package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActSpecObsDilutionCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActSpecObsDilutionCode">
 *   &lt;restriction base="{}cs">
 *     &lt;enumeration value="DILUTION"/>
 *     &lt;enumeration value="AUTO-HIGH"/>
 *     &lt;enumeration value="AUTO-LOW"/>
 *     &lt;enumeration value="PRE"/>
 *     &lt;enumeration value="RERUN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActSpecObsDilutionCode")
@XmlEnum
public enum ActSpecObsDilutionCode {

    DILUTION("DILUTION"),
    @XmlEnumValue("AUTO-HIGH")
    AUTO_HIGH("AUTO-HIGH"),
    @XmlEnumValue("AUTO-LOW")
    AUTO_LOW("AUTO-LOW"),
    PRE("PRE"),
    RERUN("RERUN");
    private final String value;

    ActSpecObsDilutionCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActSpecObsDilutionCode fromValue(String v) {
        for (ActSpecObsDilutionCode c: ActSpecObsDilutionCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}