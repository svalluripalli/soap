//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.07 at 05:07:17 PM EDT 
//


package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MdfRmimRowType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MdfRmimRowType">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="assoc"/>
 *     &lt;enumeration value="attr"/>
 *     &lt;enumeration value="class"/>
 *     &lt;enumeration value="rmim"/>
 *     &lt;enumeration value="stc"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MdfRmimRowType")
@XmlEnum
public enum MdfRmimRowType {

    @XmlEnumValue("assoc")
    ASSOC("assoc"),
    @XmlEnumValue("attr")
    ATTR("attr"),
    @XmlEnumValue("class")
    CLASS("class"),
    @XmlEnumValue("rmim")
    RMIM("rmim"),
    @XmlEnumValue("stc")
    STC("stc");
    private final String value;

    MdfRmimRowType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MdfRmimRowType fromValue(String v) {
        for (MdfRmimRowType c: MdfRmimRowType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}