
package com.sforce.soap.partner;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChildRelationship complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChildRelationship">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cascadeDelete" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="childSObject" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deprecatedAndHidden" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="field" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="junctionIdListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="junctionReferenceTo" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="relationshipName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="restrictedDelete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChildRelationship", propOrder = {
    "cascadeDelete",
    "childSObject",
    "deprecatedAndHidden",
    "field",
    "junctionIdListName",
    "junctionReferenceTo",
    "relationshipName",
    "restrictedDelete"
})
public class ChildRelationshipType {

    protected boolean cascadeDelete;
    @XmlElement(required = true)
    protected String childSObject;
    protected boolean deprecatedAndHidden;
    @XmlElement(required = true)
    protected String field;
    protected String junctionIdListName;
    @XmlElement(nillable = true)
    protected List<String> junctionReferenceTo;
    protected String relationshipName;
    protected Boolean restrictedDelete;

    /**
     * Gets the value of the cascadeDelete property.
     * 
     */
    public boolean isCascadeDelete() {
        return cascadeDelete;
    }

    /**
     * Sets the value of the cascadeDelete property.
     * 
     */
    public void setCascadeDelete(boolean value) {
        this.cascadeDelete = value;
    }

    /**
     * Gets the value of the childSObject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChildSObject() {
        return childSObject;
    }

    /**
     * Sets the value of the childSObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChildSObject(String value) {
        this.childSObject = value;
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
     * Gets the value of the field property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField() {
        return field;
    }

    /**
     * Sets the value of the field property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField(String value) {
        this.field = value;
    }

    /**
     * Gets the value of the junctionIdListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJunctionIdListName() {
        return junctionIdListName;
    }

    /**
     * Sets the value of the junctionIdListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJunctionIdListName(String value) {
        this.junctionIdListName = value;
    }

    /**
     * Gets the value of the junctionReferenceTo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the junctionReferenceTo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJunctionReferenceTo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getJunctionReferenceTo() {
        if (junctionReferenceTo == null) {
            junctionReferenceTo = new ArrayList<String>();
        }
        return this.junctionReferenceTo;
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

}
