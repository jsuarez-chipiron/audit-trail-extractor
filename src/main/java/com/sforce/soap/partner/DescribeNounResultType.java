
package com.sforce.soap.partner;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DescribeNounResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeNounResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="caseValues" type="{urn:partner.soap.sforce.com}NameCaseValue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="developerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gender" type="{urn:partner.soap.sforce.com}Gender"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pluralAlias" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="startsWith" type="{urn:partner.soap.sforce.com}StartsWith"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeNounResult", propOrder = {
    "caseValues",
    "developerName",
    "gender",
    "name",
    "pluralAlias",
    "startsWith"
})
public class DescribeNounResultType {

    protected List<NameCaseValueType> caseValues;
    @XmlElement(required = true)
    protected String developerName;
    @XmlElement(required = true, nillable = true)
    protected GenderType gender;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true, nillable = true)
    protected String pluralAlias;
    @XmlElement(required = true, nillable = true)
    protected StartsWithType startsWith;

    /**
     * Gets the value of the caseValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the caseValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCaseValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameCaseValueType }
     * 
     * 
     */
    public List<NameCaseValueType> getCaseValues() {
        if (caseValues == null) {
            caseValues = new ArrayList<NameCaseValueType>();
        }
        return this.caseValues;
    }

    /**
     * Gets the value of the developerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeveloperName() {
        return developerName;
    }

    /**
     * Sets the value of the developerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeveloperName(String value) {
        this.developerName = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link GenderType }
     *     
     */
    public GenderType getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderType }
     *     
     */
    public void setGender(GenderType value) {
        this.gender = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the pluralAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPluralAlias() {
        return pluralAlias;
    }

    /**
     * Sets the value of the pluralAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPluralAlias(String value) {
        this.pluralAlias = value;
    }

    /**
     * Gets the value of the startsWith property.
     * 
     * @return
     *     possible object is
     *     {@link StartsWithType }
     *     
     */
    public StartsWithType getStartsWith() {
        return startsWith;
    }

    /**
     * Sets the value of the startsWith property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartsWithType }
     *     
     */
    public void setStartsWith(StartsWithType value) {
        this.startsWith = value;
    }

}
