
package com.ebay.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UserStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Suspended"/>
 *     &lt;enumeration value="Confirmed"/>
 *     &lt;enumeration value="Unconfirmed"/>
 *     &lt;enumeration value="Ghost"/>
 *     &lt;enumeration value="InMaintenance"/>
 *     &lt;enumeration value="Deleted"/>
 *     &lt;enumeration value="CreditCardVerify"/>
 *     &lt;enumeration value="AccountOnHold"/>
 *     &lt;enumeration value="Merged"/>
 *     &lt;enumeration value="RegistrationCodeMailOut"/>
 *     &lt;enumeration value="TermPending"/>
 *     &lt;enumeration value="UnconfirmedHalfOptIn"/>
 *     &lt;enumeration value="CreditCardVerifyHalfOptIn"/>
 *     &lt;enumeration value="UnconfirmedPassport"/>
 *     &lt;enumeration value="CreditCardVerifyPassport"/>
 *     &lt;enumeration value="UnconfirmedExpress"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UserStatusCodeType")
@XmlEnum
public enum UserStatusCodeType {


    /**
     * 
     * 						     User properties have never been set. 
     * 						     This value should seldom, if ever, be returned 
     * 						     and typically represents a problem. 
     * 					
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),

    /**
     * 
     * 						    User has been suspended from selling and buying, 
     * 						    such as for violations of eBay terms or agreement. 
     * 					
     * 
     */
    @XmlEnumValue("Suspended")
    SUSPENDED("Suspended"),

    /**
     * 
     * 						   User has completed online registration and has 
     * 						   properly responded to confirmation email. Most 
     * 						   users should fall in this category. 
     * 					
     * 
     */
    @XmlEnumValue("Confirmed")
    CONFIRMED("Confirmed"),

    /**
     * 
     * 						    User has completed online registration, but 
     * 						    has either not responded to confirmation email 
     * 						    or has not yet been sent the confirmation email. . 
     * 					
     * 
     */
    @XmlEnumValue("Unconfirmed")
    UNCONFIRMED("Unconfirmed"),

    /**
     * 
     * 						    Registered users of AuctionWeb (pre-eBay) 
     * 						    who never re-registered on eBay.  
     * 					
     * 
     */
    @XmlEnumValue("Ghost")
    GHOST("Ghost"),

    /**
     * 
     * 						    Temporary user record state indicating the 
     * 						    record is in the process of being changed by 
     * 						    eBay. Query user information again to get new 
     * 						    status.   
     * 					
     * 
     */
    @XmlEnumValue("InMaintenance")
    IN_MAINTENANCE("InMaintenance"),

    /**
     * 
     * 						    Records for the specified user have been deleted.  
     * 					
     * 
     */
    @XmlEnumValue("Deleted")
    DELETED("Deleted"),

    /**
     * 
     * 						    User has completed registration and confirmation, 
     * 						    but is pending a verification of credit card information. 
     * 					
     * 
     */
    @XmlEnumValue("CreditCardVerify")
    CREDIT_CARD_VERIFY("CreditCardVerify"),

    /**
     * 
     * 						    User's account is on hold, such as for non-payment 
     * 						    of amounts due eBay. User cannot sell or buy items.   
     * 					
     * 
     */
    @XmlEnumValue("AccountOnHold")
    ACCOUNT_ON_HOLD("AccountOnHold"),

    /**
     * 
     * 						      User record has been merged with another account 
     * 						      record for the same user. 
     * 					
     * 
     */
    @XmlEnumValue("Merged")
    MERGED("Merged"),

    /**
     * 
     * 						    User has completed online registration and has 
     * 						    been sent the confirmation email, but has not yet 
     * 						    responded to the confirmation email. 
     * 					
     * 
     */
    @XmlEnumValue("RegistrationCodeMailOut")
    REGISTRATION_CODE_MAIL_OUT("RegistrationCodeMailOut"),

    /**
     * 
     * 						      User has been scheduled for account closure 
     * 						      (typically when a user has requested to have 
     * 						      their account closed.) A user in this state should 
     * 						      not be considered an active user. 
     * 					
     * 
     */
    @XmlEnumValue("TermPending")
    TERM_PENDING("TermPending"),

    /**
     * 
     * 						      User has completed the registration for 
     * 						      Half.com and opted to automatically also be 
     * 						      registered with eBay, but the registration 
     * 						      confirmation is still pending. 
     * 					
     * 
     */
    @XmlEnumValue("UnconfirmedHalfOptIn")
    UNCONFIRMED_HALF_OPT_IN("UnconfirmedHalfOptIn"),

    /**
     * 
     * 						      User has completed the registration for 
     * 						      Half.com and opted to automatically also be 
     * 						      registered with eBay, but the verification of 
     * 						      credit card information is still pending. 
     * 					
     * 
     */
    @XmlEnumValue("CreditCardVerifyHalfOptIn")
    CREDIT_CARD_VERIFY_HALF_OPT_IN("CreditCardVerifyHalfOptIn"),

    /**
     * 
     * 						      Passport User. User has completed the registration process, but the registration confirmation is still pending. 
     * 					
     * 
     */
    @XmlEnumValue("UnconfirmedPassport")
    UNCONFIRMED_PASSPORT("UnconfirmedPassport"),

    /**
     * 
     * 						     Passport User Requiring Credit Card Verification. User has completed the registration process with credit card verification, but the registration confirmation is still pending. 
     * 					
     * 
     */
    @XmlEnumValue("CreditCardVerifyPassport")
    CREDIT_CARD_VERIFY_PASSPORT("CreditCardVerifyPassport"),

    /**
     * 
     * 						     Half.com User. User has completed the registration for Half.com and opted to automatically also be registered with eBay, but the registration confirmation is still pending. 
     * 					
     * 
     */
    @XmlEnumValue("UnconfirmedExpress")
    UNCONFIRMED_EXPRESS("UnconfirmedExpress"),

    /**
     * 
     * 						  Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    UserStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UserStatusCodeType fromValue(String v) {
        for (UserStatusCodeType c: UserStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
