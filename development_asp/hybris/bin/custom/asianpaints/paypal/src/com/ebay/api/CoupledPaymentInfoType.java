
package com.ebay.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 						Information about Coupled Payment transactions.
 * 					
 * 
 * <p>Java class for CoupledPaymentInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoupledPaymentInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CoupledPaymentRequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CoupledPaymentID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoupledPaymentInfoType", propOrder = {
    "coupledPaymentRequestID",
    "coupledPaymentID"
})
public class CoupledPaymentInfoType {

    @XmlElement(name = "CoupledPaymentRequestID")
    protected String coupledPaymentRequestID;
    @XmlElement(name = "CoupledPaymentID", required = true)
    protected String coupledPaymentID;

    /**
     * Gets the value of the coupledPaymentRequestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoupledPaymentRequestID() {
        return coupledPaymentRequestID;
    }

    /**
     * Sets the value of the coupledPaymentRequestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoupledPaymentRequestID(String value) {
        this.coupledPaymentRequestID = value;
    }

    /**
     * Gets the value of the coupledPaymentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoupledPaymentID() {
        return coupledPaymentID;
    }

    /**
     * Sets the value of the coupledPaymentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoupledPaymentID(String value) {
        this.coupledPaymentID = value;
    }

}
