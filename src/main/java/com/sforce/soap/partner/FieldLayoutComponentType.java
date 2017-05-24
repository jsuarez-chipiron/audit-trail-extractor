
package com.sforce.soap.partner;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FieldLayoutComponent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FieldLayoutComponent">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:partner.soap.sforce.com}DescribeLayoutComponent">
 *       &lt;sequence>
 *         &lt;element name="components" type="{urn:partner.soap.sforce.com}DescribeLayoutComponent" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fieldType" type="{urn:partner.soap.sforce.com}fieldType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FieldLayoutComponent", propOrder = {
    "components",
    "fieldType"
})
public class FieldLayoutComponentType
    extends DescribeLayoutComponentType
{

    protected List<DescribeLayoutComponentType> components;
    @XmlElement(required = true)
    protected FieldTypeType fieldType;

    /**
     * Gets the value of the components property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the components property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescribeLayoutComponentType }
     * 
     * 
     */
    public List<DescribeLayoutComponentType> getComponents() {
        if (components == null) {
            components = new ArrayList<DescribeLayoutComponentType>();
        }
        return this.components;
    }

    /**
     * Gets the value of the fieldType property.
     * 
     * @return
     *     possible object is
     *     {@link FieldTypeType }
     *     
     */
    public FieldTypeType getFieldType() {
        return fieldType;
    }

    /**
     * Sets the value of the fieldType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldTypeType }
     *     
     */
    public void setFieldType(FieldTypeType value) {
        this.fieldType = value;
    }

}
