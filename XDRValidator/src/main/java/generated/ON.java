//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.07 at 05:07:17 PM EDT 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A name for an organization. A sequence of name parts.
 *          
 * 
 * <p>Java class for ON complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ON">
 *   &lt;complexContent>
 *     &lt;restriction base="{}EN">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="delimiter" type="{}en.delimiter"/>
 *           &lt;element name="prefix" type="{}en.prefix"/>
 *           &lt;element name="suffix" type="{}en.suffix"/>
 *         &lt;/choice>
 *         &lt;element name="validTime" type="{}IVL_TS" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="use" type="{}set_EntityNameUse" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ON")
public class ON
    extends EN
{


}
