
package com.sforce.soap.partner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NameCaseValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NameCaseValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="article" type="{urn:partner.soap.sforce.com}Article"/>
 *         &lt;element name="caseType" type="{urn:partner.soap.sforce.com}CaseType"/>
 *         &lt;element name="number" type="{urn:partner.soap.sforce.com}GrammaticalNumber"/>
 *         &lt;element name="possessive" type="{urn:partner.soap.sforce.com}Possessive"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NameCaseValue", propOrder = {
    "article",
    "caseType",
    "number",
    "possessive",
    "value"
})
public class NameCaseValueType {

    @XmlElement(required = true, nillable = true)
    protected ArticleType article;
    @XmlElement(required = true, nillable = true)
    protected CaseTypeType caseType;
    @XmlElement(required = true, nillable = true)
    protected GrammaticalNumberType number;
    @XmlElement(required = true, nillable = true)
    protected PossessiveType possessive;
    @XmlElement(required = true)
    protected String value;

    /**
     * Gets the value of the article property.
     * 
     * @return
     *     possible object is
     *     {@link ArticleType }
     *     
     */
    public ArticleType getArticle() {
        return article;
    }

    /**
     * Sets the value of the article property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArticleType }
     *     
     */
    public void setArticle(ArticleType value) {
        this.article = value;
    }

    /**
     * Gets the value of the caseType property.
     * 
     * @return
     *     possible object is
     *     {@link CaseTypeType }
     *     
     */
    public CaseTypeType getCaseType() {
        return caseType;
    }

    /**
     * Sets the value of the caseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseTypeType }
     *     
     */
    public void setCaseType(CaseTypeType value) {
        this.caseType = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link GrammaticalNumberType }
     *     
     */
    public GrammaticalNumberType getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrammaticalNumberType }
     *     
     */
    public void setNumber(GrammaticalNumberType value) {
        this.number = value;
    }

    /**
     * Gets the value of the possessive property.
     * 
     * @return
     *     possible object is
     *     {@link PossessiveType }
     *     
     */
    public PossessiveType getPossessive() {
        return possessive;
    }

    /**
     * Sets the value of the possessive property.
     * 
     * @param value
     *     allowed object is
     *     {@link PossessiveType }
     *     
     */
    public void setPossessive(PossessiveType value) {
        this.possessive = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

}
