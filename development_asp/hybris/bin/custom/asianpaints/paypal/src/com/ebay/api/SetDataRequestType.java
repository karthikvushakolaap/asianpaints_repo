
package com.ebay.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SetDataRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetDataRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BillingApprovalDetails" type="{urn:ebay:apis:eBLBaseComponents}BillingApprovalDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BuyerDetail" type="{urn:ebay:apis:eBLBaseComponents}BuyerDetailType" minOccurs="0"/>
 *         &lt;element name="InfoSharingDirectives" type="{urn:ebay:apis:eBLBaseComponents}InfoSharingDirectivesType" minOccurs="0"/>
 *         &lt;element name="RetrieveShippingAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserChannel" type="{urn:ebay:apis:eBLBaseComponents}UserChannelCodeType" minOccurs="0"/>
 *         &lt;element name="ReqConfirmShipping" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PaymentDetails" type="{urn:ebay:apis:eBLBaseComponents}PaymentDetailsType" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="ExternalPartnerTrackingDetails" type="{urn:ebay:apis:eBLBaseComponents}ExternalPartnerTrackingDetailsType" minOccurs="0"/>
 *         &lt;element name="URI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetDataRequestType", propOrder = {
    "billingApprovalDetails",
    "buyerDetail",
    "infoSharingDirectives",
    "retrieveShippingAddress",
    "userChannel",
    "reqConfirmShipping",
    "paymentDetails",
    "externalPartnerTrackingDetails",
    "uri"
})
public class SetDataRequestType {

    @XmlElement(name = "BillingApprovalDetails")
    protected List<BillingApprovalDetailsType> billingApprovalDetails;
    @XmlElement(name = "BuyerDetail")
    protected BuyerDetailType buyerDetail;
    @XmlElement(name = "InfoSharingDirectives")
    protected InfoSharingDirectivesType infoSharingDirectives;
    @XmlElement(name = "RetrieveShippingAddress")
    protected Boolean retrieveShippingAddress;
    @XmlElement(name = "UserChannel")
    protected UserChannelCodeType userChannel;
    @XmlElement(name = "ReqConfirmShipping")
    protected Boolean reqConfirmShipping;
    @XmlElement(name = "PaymentDetails")
    protected List<PaymentDetailsType> paymentDetails;
    @XmlElement(name = "ExternalPartnerTrackingDetails")
    protected ExternalPartnerTrackingDetailsType externalPartnerTrackingDetails;
    @XmlElement(name = "URI")
    protected String uri;

    /**
     * Gets the value of the billingApprovalDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billingApprovalDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillingApprovalDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillingApprovalDetailsType }
     * 
     * 
     */
    public List<BillingApprovalDetailsType> getBillingApprovalDetails() {
        if (billingApprovalDetails == null) {
            billingApprovalDetails = new ArrayList<BillingApprovalDetailsType>();
        }
        return this.billingApprovalDetails;
    }

    /**
     * Gets the value of the buyerDetail property.
     * 
     * @return
     *     possible object is
     *     {@link BuyerDetailType }
     *     
     */
    public BuyerDetailType getBuyerDetail() {
        return buyerDetail;
    }

    /**
     * Sets the value of the buyerDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuyerDetailType }
     *     
     */
    public void setBuyerDetail(BuyerDetailType value) {
        this.buyerDetail = value;
    }

    /**
     * Gets the value of the infoSharingDirectives property.
     * 
     * @return
     *     possible object is
     *     {@link InfoSharingDirectivesType }
     *     
     */
    public InfoSharingDirectivesType getInfoSharingDirectives() {
        return infoSharingDirectives;
    }

    /**
     * Sets the value of the infoSharingDirectives property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoSharingDirectivesType }
     *     
     */
    public void setInfoSharingDirectives(InfoSharingDirectivesType value) {
        this.infoSharingDirectives = value;
    }

    /**
     * Gets the value of the retrieveShippingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRetrieveShippingAddress() {
        return retrieveShippingAddress;
    }

    /**
     * Sets the value of the retrieveShippingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRetrieveShippingAddress(Boolean value) {
        this.retrieveShippingAddress = value;
    }

    /**
     * Gets the value of the userChannel property.
     * 
     * @return
     *     possible object is
     *     {@link UserChannelCodeType }
     *     
     */
    public UserChannelCodeType getUserChannel() {
        return userChannel;
    }

    /**
     * Sets the value of the userChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserChannelCodeType }
     *     
     */
    public void setUserChannel(UserChannelCodeType value) {
        this.userChannel = value;
    }

    /**
     * Gets the value of the reqConfirmShipping property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReqConfirmShipping() {
        return reqConfirmShipping;
    }

    /**
     * Sets the value of the reqConfirmShipping property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReqConfirmShipping(Boolean value) {
        this.reqConfirmShipping = value;
    }

    /**
     * Gets the value of the paymentDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentDetailsType }
     * 
     * 
     */
    public List<PaymentDetailsType> getPaymentDetails() {
        if (paymentDetails == null) {
            paymentDetails = new ArrayList<PaymentDetailsType>();
        }
        return this.paymentDetails;
    }

    /**
     * Gets the value of the externalPartnerTrackingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalPartnerTrackingDetailsType }
     *     
     */
    public ExternalPartnerTrackingDetailsType getExternalPartnerTrackingDetails() {
        return externalPartnerTrackingDetails;
    }

    /**
     * Sets the value of the externalPartnerTrackingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalPartnerTrackingDetailsType }
     *     
     */
    public void setExternalPartnerTrackingDetails(ExternalPartnerTrackingDetailsType value) {
        this.externalPartnerTrackingDetails = value;
    }

    /**
     * Gets the value of the uri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURI() {
        return uri;
    }

    /**
     * Sets the value of the uri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURI(String value) {
        this.uri = value;
    }

}
