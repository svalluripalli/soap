//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.07 at 05:07:17 PM EDT 
//


package generated;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GLIST_PQ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GLIST_PQ">
 *   &lt;complexContent>
 *     &lt;extension base="{}ANY">
 *       &lt;sequence>
 *         &lt;element name="head" type="{}PQ"/>
 *         &lt;element name="increment" type="{}PQ"/>
 *       &lt;/sequence>
 *       &lt;attribute name="period" type="{}int" />
 *       &lt;attribute name="denominator" type="{}int" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GLIST_PQ", propOrder = {
    "head",
    "increment"
})
public class GLISTPQ
    extends ANY
{

    @XmlElement(required = true)
    protected PQ head;
    @XmlElement(required = true)
    protected PQ increment;
    @XmlAttribute(name = "period")
    protected BigInteger period;
    @XmlAttribute(name = "denominator")
    protected BigInteger denominator;

    /**
     * Gets the value of the head property.
     * 
     * @return
     *     possible object is
     *     {@link PQ }
     *     
     */
    public PQ getHead() {
        return head;
    }

    /**
     * Sets the value of the head property.
     * 
     * @param value
     *     allowed object is
     *     {@link PQ }
     *     
     */
    public void setHead(PQ value) {
        this.head = value;
    }

    /**
     * Gets the value of the increment property.
     * 
     * @return
     *     possible object is
     *     {@link PQ }
     *     
     */
    public PQ getIncrement() {
        return increment;
    }

    /**
     * Sets the value of the increment property.
     * 
     * @param value
     *     allowed object is
     *     {@link PQ }
     *     
     */
    public void setIncrement(PQ value) {
        this.increment = value;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPeriod(BigInteger value) {
        this.period = value;
    }

    /**
     * Gets the value of the denominator property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDenominator() {
        return denominator;
    }

    /**
     * Sets the value of the denominator property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDenominator(BigInteger value) {
        this.denominator = value;
    }

}
