
package com.sforce.soap.partner;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.sforce.soap.partner.sobject.SObject;


/**
 * <p>Java class for MatchRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MatchRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="additionalInformation" type="{urn:partner.soap.sforce.com}AdditionalInformationMap" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fieldDiffs" type="{urn:partner.soap.sforce.com}FieldDiff" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="matchConfidence" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="record" type="{urn:sobject.partner.soap.sforce.com}sObject"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatchRecord", propOrder = {
    "additionalInformation",
    "fieldDiffs",
    "matchConfidence",
    "record"
})
public class MatchRecordType {

    protected List<AdditionalInformationMapType> additionalInformation;
    protected List<FieldDiffType> fieldDiffs;
    protected double matchConfidence;
    @XmlElement(required = true)
    protected SObject record;

    /**
     * Gets the value of the additionalInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInformationMapType }
     * 
     * 
     */
    public List<AdditionalInformationMapType> getAdditionalInformation() {
        if (additionalInformation == null) {
            additionalInformation = new ArrayList<AdditionalInformationMapType>();
        }
        return this.additionalInformation;
    }

    /**
     * Gets the value of the fieldDiffs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldDiffs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldDiffs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FieldDiffType }
     * 
     * 
     */
    public List<FieldDiffType> getFieldDiffs() {
        if (fieldDiffs == null) {
            fieldDiffs = new ArrayList<FieldDiffType>();
        }
        return this.fieldDiffs;
    }

    /**
     * Gets the value of the matchConfidence property.
     * 
     */
    public double getMatchConfidence() {
        return matchConfidence;
    }

    /**
     * Sets the value of the matchConfidence property.
     * 
     */
    public void setMatchConfidence(double value) {
        this.matchConfidence = value;
    }

    /**
     * Gets the value of the record property.
     * 
     * @return
     *     possible object is
     *     {@link SObject }
     *     
     */
    public SObject getRecord() {
        return record;
    }

    /**
     * Sets the value of the record property.
     * 
     * @param value
     *     allowed object is
     *     {@link SObject }
     *     
     */
    public void setRecord(SObject value) {
        this.record = value;
    }

}
