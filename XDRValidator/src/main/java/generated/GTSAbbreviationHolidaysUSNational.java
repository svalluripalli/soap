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
 * <p>Java class for GTSAbbreviationHolidaysUSNational.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GTSAbbreviationHolidaysUSNational">
 *   &lt;restriction base="{}cs">
 *     &lt;enumeration value="JHNUS"/>
 *     &lt;enumeration value="JHNUSCLM"/>
 *     &lt;enumeration value="JHNUSIND"/>
 *     &lt;enumeration value="JHNUSIND1"/>
 *     &lt;enumeration value="JHNUSIND5"/>
 *     &lt;enumeration value="JHNUSLBR"/>
 *     &lt;enumeration value="JHNUSMEM"/>
 *     &lt;enumeration value="JHNUSMEM5"/>
 *     &lt;enumeration value="JHNUSMEM6"/>
 *     &lt;enumeration value="JHNUSMLK"/>
 *     &lt;enumeration value="JHNUSPRE"/>
 *     &lt;enumeration value="JHNUSTKS"/>
 *     &lt;enumeration value="JHNUSTKS5"/>
 *     &lt;enumeration value="JHNUSVET"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GTSAbbreviationHolidaysUSNational")
@XmlEnum
public enum GTSAbbreviationHolidaysUSNational {

    JHNUS("JHNUS"),
    JHNUSCLM("JHNUSCLM"),
    JHNUSIND("JHNUSIND"),
    @XmlEnumValue("JHNUSIND1")
    JHNUSIND_1("JHNUSIND1"),
    @XmlEnumValue("JHNUSIND5")
    JHNUSIND_5("JHNUSIND5"),
    JHNUSLBR("JHNUSLBR"),
    JHNUSMEM("JHNUSMEM"),
    @XmlEnumValue("JHNUSMEM5")
    JHNUSMEM_5("JHNUSMEM5"),
    @XmlEnumValue("JHNUSMEM6")
    JHNUSMEM_6("JHNUSMEM6"),
    JHNUSMLK("JHNUSMLK"),
    JHNUSPRE("JHNUSPRE"),
    JHNUSTKS("JHNUSTKS"),
    @XmlEnumValue("JHNUSTKS5")
    JHNUSTKS_5("JHNUSTKS5"),
    JHNUSVET("JHNUSVET");
    private final String value;

    GTSAbbreviationHolidaysUSNational(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GTSAbbreviationHolidaysUSNational fromValue(String v) {
        for (GTSAbbreviationHolidaysUSNational c: GTSAbbreviationHolidaysUSNational.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
