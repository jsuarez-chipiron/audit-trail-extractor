
package com.sforce.soap.partner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="sObjectType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="recentsOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isSoqlCompatible" type="{urn:partner.soap.sforce.com}listViewIsSoqlCompatible"/>
 *         &lt;element name="limit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="offset" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "sObjectType",
    "recentsOnly",
    "isSoqlCompatible",
    "limit",
    "offset"
})
@XmlRootElement(name = "describeSObjectListViews")
public class DescribeSObjectListViews {

    @XmlElement(required = true)
    protected String sObjectType;
    protected boolean recentsOnly;
    @XmlElement(required = true)
    protected ListViewIsSoqlCompatibleType isSoqlCompatible;
    protected int limit;
    protected int offset;

    /**
     * Gets the value of the sObjectType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSObjectType() {
        return sObjectType;
    }

    /**
     * Sets the value of the sObjectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSObjectType(String value) {
        this.sObjectType = value;
    }

    /**
     * Gets the value of the recentsOnly property.
     * 
     */
    public boolean isRecentsOnly() {
        return recentsOnly;
    }

    /**
     * Sets the value of the recentsOnly property.
     * 
     */
    public void setRecentsOnly(boolean value) {
        this.recentsOnly = value;
    }

    /**
     * Gets the value of the isSoqlCompatible property.
     * 
     * @return
     *     possible object is
     *     {@link ListViewIsSoqlCompatibleType }
     *     
     */
    public ListViewIsSoqlCompatibleType getIsSoqlCompatible() {
        return isSoqlCompatible;
    }

    /**
     * Sets the value of the isSoqlCompatible property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListViewIsSoqlCompatibleType }
     *     
     */
    public void setIsSoqlCompatible(ListViewIsSoqlCompatibleType value) {
        this.isSoqlCompatible = value;
    }

    /**
     * Gets the value of the limit property.
     * 
     */
    public int getLimit() {
        return limit;
    }

    /**
     * Sets the value of the limit property.
     * 
     */
    public void setLimit(int value) {
        this.limit = value;
    }

    /**
     * Gets the value of the offset property.
     * 
     */
    public int getOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     */
    public void setOffset(int value) {
        this.offset = value;
    }

}
