
package com.ebay.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CoupledBucketsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoupledBucketsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CoupleType" type="{urn:ebay:apis:eBLBaseComponents}CoupleType" minOccurs="0"/>
 *         &lt;element name="CoupledPaymentRequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentRequestID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="10" minOccurs="2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoupledBucketsType", propOrder = {
    "coupleType",
    "coupledPaymentRequestID",
    "paymentRequestID"
})
public class CoupledBucketsType {

    @XmlElement(name = "CoupleType")
    protected CoupleType coupleType;
    @XmlElement(name = "CoupledPaymentRequestID")
    protected String coupledPaymentRequestID;
    @XmlElement(name = "PaymentRequestID", required = true)
    protected List<String> paymentRequestID;

    /**
     * Gets the value of the coupleType property.
     * 
     * @return
     *     possible object is
     *     {@link CoupleType }
     *     
     */
    public CoupleType getCoupleType() {
        return coupleType;
    }

    /**
     * Sets the value of the coupleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoupleType }
     *     
     */
    public void setCoupleType(CoupleType value) {
        this.coupleType = value;
    }

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
     * Gets the value of the paymentRequestID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentRequestID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentRequestID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPaymentRequestID() {
        if (paymentRequestID == null) {
            paymentRequestID = new ArrayList<String>();
        }
        return this.paymentRequestID;
    }

}
