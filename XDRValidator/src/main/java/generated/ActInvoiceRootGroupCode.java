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
 * <p>Java class for ActInvoiceRootGroupCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActInvoiceRootGroupCode">
 *   &lt;restriction base="{}cs">
 *     &lt;enumeration value="RXCINV"/>
 *     &lt;enumeration value="RXDINV"/>
 *     &lt;enumeration value="CPINV"/>
 *     &lt;enumeration value="CSPINV"/>
 *     &lt;enumeration value="CSINV"/>
 *     &lt;enumeration value="FININV"/>
 *     &lt;enumeration value="OHSINV"/>
 *     &lt;enumeration value="PAINV"/>
 *     &lt;enumeration value="SBFINV"/>
 *     &lt;enumeration value="VRXINV"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActInvoiceRootGroupCode")
@XmlEnum
public enum ActInvoiceRootGroupCode {

    RXCINV,
    RXDINV,
    CPINV,
    CSPINV,
    CSINV,
    FININV,
    OHSINV,
    PAINV,
    SBFINV,
    VRXINV;

    public String value() {
        return name();
    }

    public static ActInvoiceRootGroupCode fromValue(String v) {
        return valueOf(v);
    }

}
