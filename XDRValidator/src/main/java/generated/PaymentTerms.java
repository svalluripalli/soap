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
 * <p>Java class for PaymentTerms.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentTerms">
 *   &lt;restriction base="{}cs">
 *     &lt;enumeration value="COD"/>
 *     &lt;enumeration value="N30"/>
 *     &lt;enumeration value="N60"/>
 *     &lt;enumeration value="N90"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaymentTerms")
@XmlEnum
public enum PaymentTerms {

    COD("COD"),
    @XmlEnumValue("N30")
    N_30("N30"),
    @XmlEnumValue("N60")
    N_60("N60"),
    @XmlEnumValue("N90")
    N_90("N90");
    private final String value;

    PaymentTerms(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentTerms fromValue(String v) {
        for (PaymentTerms c: PaymentTerms.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
