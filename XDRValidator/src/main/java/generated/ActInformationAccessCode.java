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
 * <p>Java class for ActInformationAccessCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActInformationAccessCode">
 *   &lt;restriction base="{}cs">
 *     &lt;enumeration value="ACADR"/>
 *     &lt;enumeration value="ACALLG"/>
 *     &lt;enumeration value="ACOBS"/>
 *     &lt;enumeration value="ACDEMO"/>
 *     &lt;enumeration value="ACIMMUN"/>
 *     &lt;enumeration value="ACLAB"/>
 *     &lt;enumeration value="ACMEDC"/>
 *     &lt;enumeration value="ACMED"/>
 *     &lt;enumeration value="ACPOLPRG"/>
 *     &lt;enumeration value="ACPSERV"/>
 *     &lt;enumeration value="ACPROV"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActInformationAccessCode")
@XmlEnum
public enum ActInformationAccessCode {

    ACADR,
    ACALLG,
    ACOBS,
    ACDEMO,
    ACIMMUN,
    ACLAB,
    ACMEDC,
    ACMED,
    ACPOLPRG,
    ACPSERV,
    ACPROV;

    public String value() {
        return name();
    }

    public static ActInformationAccessCode fromValue(String v) {
        return valueOf(v);
    }

}
