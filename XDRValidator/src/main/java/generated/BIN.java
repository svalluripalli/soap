//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.07 at 05:07:17 PM EDT 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Binary data is a raw block of bits. Binary data is a
 *             protected type that MUST not be used outside the data
 *             type specification.
 *          
 * 
 * <p>Java class for BIN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BIN">
 *   &lt;complexContent>
 *     &lt;extension base="{}ANY">
 *       &lt;attribute name="representation" type="{}BinaryDataEncoding" default="TXT" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BIN")
@XmlSeeAlso({
    ED.class
})
public abstract class BIN
    extends ANY
{

    @XmlAttribute(name = "representation")
    protected BinaryDataEncoding representation;

    /**
     * Gets the value of the representation property.
     * 
     * @return
     *     possible object is
     *     {@link BinaryDataEncoding }
     *     
     */
    public BinaryDataEncoding getRepresentation() {
        if (representation == null) {
            return BinaryDataEncoding.TXT;
        } else {
            return representation;
        }
    }

    /**
     * Sets the value of the representation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinaryDataEncoding }
     *     
     */
    public void setRepresentation(BinaryDataEncoding value) {
        this.representation = value;
    }

}
