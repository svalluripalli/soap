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
 * <p>Java class for ProbabilityDistributionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProbabilityDistributionType">
 *   &lt;restriction base="{}cs">
 *     &lt;enumeration value="G"/>
 *     &lt;enumeration value="F"/>
 *     &lt;enumeration value="T"/>
 *     &lt;enumeration value="B"/>
 *     &lt;enumeration value="X2"/>
 *     &lt;enumeration value="E"/>
 *     &lt;enumeration value="LN"/>
 *     &lt;enumeration value="N"/>
 *     &lt;enumeration value="U"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProbabilityDistributionType")
@XmlEnum
public enum ProbabilityDistributionType {

    G("G"),
    F("F"),
    T("T"),
    B("B"),
    @XmlEnumValue("X2")
    X_2("X2"),
    E("E"),
    LN("LN"),
    N("N"),
    U("U");
    private final String value;

    ProbabilityDistributionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProbabilityDistributionType fromValue(String v) {
        for (ProbabilityDistributionType c: ProbabilityDistributionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
