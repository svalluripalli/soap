//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.07 at 05:07:17 PM EDT 
//


package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryResponse.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QueryResponse">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="AE"/>
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="NF"/>
 *     &lt;enumeration value="QE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QueryResponse")
@XmlEnum
public enum QueryResponse {

    AE,
    OK,
    NF,
    QE;

    public String value() {
        return name();
    }

    public static QueryResponse fromValue(String v) {
        return valueOf(v);
    }

}