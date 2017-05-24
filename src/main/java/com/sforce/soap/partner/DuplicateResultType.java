
package com.sforce.soap.partner;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DuplicateResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DuplicateResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="allowSave" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="duplicateRule" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="duplicateRuleEntityType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="errorMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="matchResults" type="{urn:partner.soap.sforce.com}MatchResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DuplicateResult", propOrder = {
    "allowSave",
    "duplicateRule",
    "duplicateRuleEntityType",
    "errorMessage",
    "matchResults"
})
public class DuplicateResultType {

    protected boolean allowSave;
    @XmlElement(required = true)
    protected String duplicateRule;
    @XmlElement(required = true)
    protected String duplicateRuleEntityType;
    @XmlElement(required = true)
    protected String errorMessage;
    protected List<MatchResultType> matchResults;

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
     * Gets the value of the duplicateRule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuplicateRule() {
        return duplicateRule;
    }

    /**
     * Sets the value of the duplicateRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuplicateRule(String value) {
        this.duplicateRule = value;
    }

    /**
     * Gets the value of the duplicateRuleEntityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuplicateRuleEntityType() {
        return duplicateRuleEntityType;
    }

    /**
     * Sets the value of the duplicateRuleEntityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuplicateRuleEntityType(String value) {
        this.duplicateRuleEntityType = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the matchResults property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the matchResults property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMatchResults().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MatchResultType }
     * 
     * 
     */
    public List<MatchResultType> getMatchResults() {
        if (matchResults == null) {
            matchResults = new ArrayList<MatchResultType>();
        }
        return this.matchResults;
    }

}
