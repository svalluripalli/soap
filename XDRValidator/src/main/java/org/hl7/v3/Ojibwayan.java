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
 * <p>Java class for Ojibwayan.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Ojibwayan">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="x-POT"/>
 *     &lt;enumeration value="x-OJB"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Ojibwayan")
@XmlEnum
public enum Ojibwayan {

    @XmlEnumValue("x-POT")
    X_POT("x-POT"),
    @XmlEnumValue("x-OJB")
    X_OJB("x-OJB");
    private final String value;

    Ojibwayan(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Ojibwayan fromValue(String v) {
        for (Ojibwayan c: Ojibwayan.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
