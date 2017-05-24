
package com.sforce.soap.partner;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Field complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Field">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="autoNumber" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="byteLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="calculated" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="calculatedFormula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cascadeDelete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="caseSensitive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="controllerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="custom" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="defaultValueFormula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="defaultedOnCreate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="dependentPicklist" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="deprecatedAndHidden" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="digits" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="displayLocationInDecimal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="externalId" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="extraTypeInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filterable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="filteredLookupInfo" type="{urn:partner.soap.sforce.com}FilteredLookupInfo" minOccurs="0"/>
 *         &lt;element name="groupable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="highScaleNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="htmlFormatted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="idLookup" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="inlineHelpText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="length" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="mask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maskType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nameField" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="namePointing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="nillable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="permissionable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="picklistValues" type="{urn:partner.soap.sforce.com}PicklistEntry" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="precision" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="queryByDistance" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="referenceTargetField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referenceTo" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="relationshipName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="relationshipOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="restrictedDelete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="restrictedPicklist" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="scale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="soapType" type="{urn:partner.soap.sforce.com}soapType"/>
 *         &lt;element name="sortable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="type" type="{urn:partner.soap.sforce.com}fieldType"/>
 *         &lt;element name="unique" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="updateable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="writeRequiresMasterRead" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Field", propOrder = {
    "autoNumber",
    "byteLength",
    "calculated",
    "calculatedFormula",
    "cascadeDelete",
    "caseSensitive",
    "controllerName",
    "createable",
    "custom",
    "defaultValueFormula",
    "defaultedOnCreate",
    "dependentPicklist",
    "deprecatedAndHidden",
    "digits",
    "displayLocationInDecimal",
    "encrypted",
    "externalId",
    "extraTypeInfo",
    "filterable",
    "filteredLookupInfo",
    "groupable",
    "highScaleNumber",
    "htmlFormatted",
    "idLookup",
    "inlineHelpText",
    "label",
    "length",
    "mask",
    "maskType",
    "name",
    "nameField",
    "namePointing",
    "nillable",
    "permissionable",
    "picklistValues",
    "precision",
    "queryByDistance",
    "referenceTargetField",
    "referenceTo",
    "relationshipName",
    "relationshipOrder",
    "restrictedDelete",
    "restrictedPicklist",
    "scale",
    "soapType",
    "sortable",
    "type",
    "unique",
    "updateable",
    "writeRequiresMasterRead"
})
public class FieldType {

    protected boolean autoNumber;
    protected int byteLength;
    protected boolean calculated;
    protected String calculatedFormula;
    protected Boolean cascadeDelete;
    protected boolean caseSensitive;
    protected String controllerName;
    protected boolean createable;
    protected boolean custom;
    protected String defaultValueFormula;
    protected boolean defaultedOnCreate;
    protected Boolean dependentPicklist;
    protected boolean deprecatedAndHidden;
    protected int digits;
    protected Boolean displayLocationInDecimal;
    protected Boolean encrypted;
    protected Boolean externalId;
    protected String extraTypeInfo;
    protected boolean filterable;
    @XmlElementRef(name = "filteredLookupInfo", namespace = "urn:partner.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<FilteredLookupInfoType> filteredLookupInfo;
    protected boolean groupable;
    protected Boolean highScaleNumber;
    protected Boolean htmlFormatted;
    protected boolean idLookup;
    protected String inlineHelpText;
    @XmlElement(required = true)
    protected String label;
    protected int length;
    protected String mask;
    protected String maskType;
    @XmlElement(required = true)
    protected String name;
    protected boolean nameField;
    protected Boolean namePointing;
    protected boolean nillable;
    protected boolean permissionable;
    @XmlElement(nillable = true)
    protected List<PicklistEntryType> picklistValues;
    protected int precision;
    protected boolean queryByDistance;
    protected String referenceTargetField;
    @XmlElement(nillable = true)
    protected List<String> referenceTo;
    protected String relationshipName;
    protected Integer relationshipOrder;
    protected Boolean restrictedDelete;
    protected boolean restrictedPicklist;
    protected int scale;
    @XmlElement(required = true)
    protected SoapTypeType soapType;
    protected Boolean sortable;
    @XmlElement(required = true)
    protected FieldTypeType type;
    protected boolean unique;
    protected boolean updateable;
    protected Boolean writeRequiresMasterRead;

    /**
     * Gets the value of the autoNumber property.
     * 
     */
    public boolean isAutoNumber() {
        return autoNumber;
    }

    /**
     * Sets the value of the autoNumber property.
     * 
     */
    public void setAutoNumber(boolean value) {
        this.autoNumber = value;
    }

    /**
     * Gets the value of the byteLength property.
     * 
     */
    public int getByteLength() {
        return byteLength;
    }

    /**
     * Sets the value of the byteLength property.
     * 
     */
    public void setByteLength(int value) {
        this.byteLength = value;
    }

    /**
     * Gets the value of the calculated property.
     * 
     */
    public boolean isCalculated() {
        return calculated;
    }

    /**
     * Sets the value of the calculated property.
     * 
     */
    public void setCalculated(boolean value) {
        this.calculated = value;
    }

    /**
     * Gets the value of the calculatedFormula property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalculatedFormula() {
        return calculatedFormula;
    }

    /**
     * Sets the value of the calculatedFormula property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalculatedFormula(String value) {
        this.calculatedFormula = value;
    }

    /**
     * Gets the value of the cascadeDelete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCascadeDelete() {
        return cascadeDelete;
    }

    /**
     * Sets the value of the cascadeDelete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCascadeDelete(Boolean value) {
        this.cascadeDelete = value;
    }

    /**
     * Gets the value of the caseSensitive property.
     * 
     */
    public boolean isCaseSensitive() {
        return caseSensitive;
    }

    /**
     * Sets the value of the caseSensitive property.
     * 
     */
    public void setCaseSensitive(boolean value) {
        this.caseSensitive = value;
    }

    /**
     * Gets the value of the controllerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControllerName() {
        return controllerName;
    }

    /**
     * Sets the value of the controllerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControllerName(String value) {
        this.controllerName = value;
    }

    /**
     * Gets the value of the createable property.
     * 
     */
    public boolean isCreateable() {
        return createable;
    }

    /**
     * Sets the value of the createable property.
     * 
     */
    public void setCreateable(boolean value) {
        this.createable = value;
    }

    /**
     * Gets the value of the custom property.
     * 
     */
    public boolean isCustom() {
        return custom;
    }

    /**
     * Sets the value of the custom property.
     * 
     */
    public void setCustom(boolean value) {
        this.custom = value;
    }

    /**
     * Gets the value of the defaultValueFormula property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultValueFormula() {
        return defaultValueFormula;
    }

    /**
     * Sets the value of the defaultValueFormula property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultValueFormula(String value) {
        this.defaultValueFormula = value;
    }

    /**
     * Gets the value of the defaultedOnCreate property.
     * 
     */
    public boolean isDefaultedOnCreate() {
        return defaultedOnCreate;
    }

    /**
     * Sets the value of the defaultedOnCreate property.
     * 
     */
    public void setDefaultedOnCreate(boolean value) {
        this.defaultedOnCreate = value;
    }

    /**
     * Gets the value of the dependentPicklist property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDependentPicklist() {
        return dependentPicklist;
    }

    /**
     * Sets the value of the dependentPicklist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDependentPicklist(Boolean value) {
        this.dependentPicklist = value;
    }

    /**
     * Gets the value of the deprecatedAndHidden property.
     * 
     */
    public boolean isDeprecatedAndHidden() {
        return deprecatedAndHidden;
    }

    /**
     * Sets the value of the deprecatedAndHidden property.
     * 
     */
    public void setDeprecatedAndHidden(boolean value) {
        this.deprecatedAndHidden = value;
    }

    /**
     * Gets the value of the digits property.
     * 
     */
    public int getDigits() {
        return digits;
    }

    /**
     * Sets the value of the digits property.
     * 
     */
    public void setDigits(int value) {
        this.digits = value;
    }

    /**
     * Gets the value of the displayLocationInDecimal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisplayLocationInDecimal() {
        return displayLocationInDecimal;
    }

    /**
     * Sets the value of the displayLocationInDecimal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayLocationInDecimal(Boolean value) {
        this.displayLocationInDecimal = value;
    }

    /**
     * Gets the value of the encrypted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEncrypted() {
        return encrypted;
    }

    /**
     * Sets the value of the encrypted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEncrypted(Boolean value) {
        this.encrypted = value;
    }

    /**
     * Gets the value of the externalId property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExternalId() {
        return externalId;
    }

    /**
     * Sets the value of the externalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExternalId(Boolean value) {
        this.externalId = value;
    }

    /**
     * Gets the value of the extraTypeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtraTypeInfo() {
        return extraTypeInfo;
    }

    /**
     * Sets the value of the extraTypeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtraTypeInfo(String value) {
        this.extraTypeInfo = value;
    }

    /**
     * Gets the value of the filterable property.
     * 
     */
    public boolean isFilterable() {
        return filterable;
    }

    /**
     * Sets the value of the filterable property.
     * 
     */
    public void setFilterable(boolean value) {
        this.filterable = value;
    }

    /**
     * Gets the value of the filteredLookupInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FilteredLookupInfoType }{@code >}
     *     
     */
    public JAXBElement<FilteredLookupInfoType> getFilteredLookupInfo() {
        return filteredLookupInfo;
    }

    /**
     * Sets the value of the filteredLookupInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FilteredLookupInfoType }{@code >}
     *     
     */
    public void setFilteredLookupInfo(JAXBElement<FilteredLookupInfoType> value) {
        this.filteredLookupInfo = value;
    }

    /**
     * Gets the value of the groupable property.
     * 
     */
    public boolean isGroupable() {
        return groupable;
    }

    /**
     * Sets the value of the groupable property.
     * 
     */
    public void setGroupable(boolean value) {
        this.groupable = value;
    }

    /**
     * Gets the value of the highScaleNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHighScaleNumber() {
        return highScaleNumber;
    }

    /**
     * Sets the value of the highScaleNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHighScaleNumber(Boolean value) {
        this.highScaleNumber = value;
    }

    /**
     * Gets the value of the htmlFormatted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHtmlFormatted() {
        return htmlFormatted;
    }

    /**
     * Sets the value of the htmlFormatted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHtmlFormatted(Boolean value) {
        this.htmlFormatted = value;
    }

    /**
     * Gets the value of the idLookup property.
     * 
     */
    public boolean isIdLookup() {
        return idLookup;
    }

    /**
     * Sets the value of the idLookup property.
     * 
     */
    public void setIdLookup(boolean value) {
        this.idLookup = value;
    }

    /**
     * Gets the value of the inlineHelpText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInlineHelpText() {
        return inlineHelpText;
    }

    /**
     * Sets the value of the inlineHelpText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInlineHelpText(String value) {
        this.inlineHelpText = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the length property.
     * 
     */
    public int getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     */
    public void setLength(int value) {
        this.length = value;
    }

    /**
     * Gets the value of the mask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMask() {
        return mask;
    }

    /**
     * Sets the value of the mask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMask(String value) {
        this.mask = value;
    }

    /**
     * Gets the value of the maskType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaskType() {
        return maskType;
    }

    /**
     * Sets the value of the maskType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaskType(String value) {
        this.maskType = value;
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
     * Gets the value of the nameField property.
     * 
     */
    public boolean isNameField() {
        return nameField;
    }

    /**
     * Sets the value of the nameField property.
     * 
     */
    public void setNameField(boolean value) {
        this.nameField = value;
    }

    /**
     * Gets the value of the namePointing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNamePointing() {
        return namePointing;
    }

    /**
     * Sets the value of the namePointing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNamePointing(Boolean value) {
        this.namePointing = value;
    }

    /**
     * Gets the value of the nillable property.
     * 
     */
    public boolean isNillable() {
        return nillable;
    }

    /**
     * Sets the value of the nillable property.
     * 
     */
    public void setNillable(boolean value) {
        this.nillable = value;
    }

    /**
     * Gets the value of the permissionable property.
     * 
     */
    public boolean isPermissionable() {
        return permissionable;
    }

    /**
     * Sets the value of the permissionable property.
     * 
     */
    public void setPermissionable(boolean value) {
        this.permissionable = value;
    }

    /**
     * Gets the value of the picklistValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the picklistValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPicklistValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PicklistEntryType }
     * 
     * 
     */
    public List<PicklistEntryType> getPicklistValues() {
        if (picklistValues == null) {
            picklistValues = new ArrayList<PicklistEntryType>();
        }
        return this.picklistValues;
    }

    /**
     * Gets the value of the precision property.
     * 
     */
    public int getPrecision() {
        return precision;
    }

    /**
     * Sets the value of the precision property.
     * 
     */
    public void setPrecision(int value) {
        this.precision = value;
    }

    /**
     * Gets the value of the queryByDistance property.
     * 
     */
    public boolean isQueryByDistance() {
        return queryByDistance;
    }

    /**
     * Sets the value of the queryByDistance property.
     * 
     */
    public void setQueryByDistance(boolean value) {
        this.queryByDistance = value;
    }

    /**
     * Gets the value of the referenceTargetField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceTargetField() {
        return referenceTargetField;
    }

    /**
     * Sets the value of the referenceTargetField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceTargetField(String value) {
        this.referenceTargetField = value;
    }

    /**
     * Gets the value of the referenceTo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenceTo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceTo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getReferenceTo() {
        if (referenceTo == null) {
            referenceTo = new ArrayList<String>();
        }
        return this.referenceTo;
    }

    /**
     * Gets the value of the relationshipName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationshipName() {
        return relationshipName;
    }

    /**
     * Sets the value of the relationshipName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationshipName(String value) {
        this.relationshipName = value;
    }

    /**
     * Gets the value of the relationshipOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRelationshipOrder() {
        return relationshipOrder;
    }

    /**
     * Sets the value of the relationshipOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRelationshipOrder(Integer value) {
        this.relationshipOrder = value;
    }

    /**
     * Gets the value of the restrictedDelete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRestrictedDelete() {
        return restrictedDelete;
    }

    /**
     * Sets the value of the restrictedDelete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRestrictedDelete(Boolean value) {
        this.restrictedDelete = value;
    }

    /**
     * Gets the value of the restrictedPicklist property.
     * 
     */
    public boolean isRestrictedPicklist() {
        return restrictedPicklist;
    }

    /**
     * Sets the value of the restrictedPicklist property.
     * 
     */
    public void setRestrictedPicklist(boolean value) {
        this.restrictedPicklist = value;
    }

    /**
     * Gets the value of the scale property.
     * 
     */
    public int getScale() {
        return scale;
    }

    /**
     * Sets the value of the scale property.
     * 
     */
    public void setScale(int value) {
        this.scale = value;
    }

    /**
     * Gets the value of the soapType property.
     * 
     * @return
     *     possible object is
     *     {@link SoapTypeType }
     *     
     */
    public SoapTypeType getSoapType() {
        return soapType;
    }

    /**
     * Sets the value of the soapType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoapTypeType }
     *     
     */
    public void setSoapType(SoapTypeType value) {
        this.soapType = value;
    }

    /**
     * Gets the value of the sortable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSortable() {
        return sortable;
    }

    /**
     * Sets the value of the sortable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSortable(Boolean value) {
        this.sortable = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link FieldTypeType }
     *     
     */
    public FieldTypeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldTypeType }
     *     
     */
    public void setType(FieldTypeType value) {
        this.type = value;
    }

    /**
     * Gets the value of the unique property.
     * 
     */
    public boolean isUnique() {
        return unique;
    }

    /**
     * Sets the value of the unique property.
     * 
     */
    public void setUnique(boolean value) {
        this.unique = value;
    }

    /**
     * Gets the value of the updateable property.
     * 
     */
    public boolean isUpdateable() {
        return updateable;
    }

    /**
     * Sets the value of the updateable property.
     * 
     */
    public void setUpdateable(boolean value) {
        this.updateable = value;
    }

    /**
     * Gets the value of the writeRequiresMasterRead property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWriteRequiresMasterRead() {
        return writeRequiresMasterRead;
    }

    /**
     * Sets the value of the writeRequiresMasterRead property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWriteRequiresMasterRead(Boolean value) {
        this.writeRequiresMasterRead = value;
    }

}
