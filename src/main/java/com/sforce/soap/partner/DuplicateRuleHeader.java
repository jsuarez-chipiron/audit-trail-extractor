
package com.sforce.soap.partner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="allowSave" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="includeRecordDetails" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="runAsCurrentUser" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "allowSave",
    "includeRecordDetails",
    "runAsCurrentUser"
})
@XmlRootElement(name = "DuplicateRuleHeader")
public class DuplicateRuleHeader {

    protected boolean allowSave;
    protected boolean includeRecordDetails;
    protected boolean runAsCurrentUser;

    /**
     * Gets the value of the allowSave property.
     * 
     */
    public boolean isAllowSave() {
        return allowSave;
    }

    /**
     * Sets the value of the allowSave property.
     * 
     */
    public void setAllowSave(boolean value) {
        this.allowSave = value;
    }

    /**
     * Gets the value of the includeRecordDetails property.
     * 
     */
    public boolean isIncludeRecordDetails() {
        return includeRecordDetails;
    }

    /**
     * Sets the value of the includeRecordDetails property.
     * 
     */
    public void setIncludeRecordDetails(boolean value) {
        this.includeRecordDetails = value;
    }

    /**
     * Gets the value of the runAsCurrentUser property.
     * 
     */
    public boolean isRunAsCurrentUser() {
        return runAsCurrentUser;
    }

    /**
     * Sets the value of the runAsCurrentUser property.
     * 
     */
    public void setRunAsCurrentUser(boolean value) {
        this.runAsCurrentUser = value;
    }

}
