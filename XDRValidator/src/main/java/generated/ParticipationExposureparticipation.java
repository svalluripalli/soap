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
 * <p>Java class for ParticipationExposureparticipation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ParticipationExposureparticipation">
 *   &lt;restriction base="{}cs">
 *     &lt;enumeration value="EXPART"/>
 *     &lt;enumeration value="EXSRC"/>
 *     &lt;enumeration value="EXPTRGT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ParticipationExposureparticipation")
@XmlEnum
public enum ParticipationExposureparticipation {

    EXPART,
    EXSRC,
    EXPTRGT;

    public String value() {
        return name();
    }

    public static ParticipationExposureparticipation fromValue(String v) {
        return valueOf(v);
    }

}