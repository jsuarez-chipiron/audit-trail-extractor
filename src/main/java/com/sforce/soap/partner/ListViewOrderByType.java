
package com.sforce.soap.partner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListViewOrderBy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListViewOrderBy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fieldNameOrPath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nullsPosition" type="{urn:partner.soap.sforce.com}orderByNullsPosition"/>
 *         &lt;element name="sortDirection" type="{urn:partner.soap.sforce.com}orderByDirection"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListViewOrderBy", propOrder = {
    "fieldNameOrPath",
    "nullsPosition",
    "sortDirection"
})
public class ListViewOrderByType {

    @XmlElement(required = true)
    protected String fieldNameOrPath;
    @XmlElement(required = true, nillable = true)
    protected OrderByNullsPositionType nullsPosition;
    @XmlElement(required = true, nillable = true)
    protected OrderByDirectionType sortDirection;

    /**
     * Gets the value of the fieldNameOrPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldNameOrPath() {
        return fieldNameOrPath;
    }

    /**
     * Sets the value of the fieldNameOrPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldNameOrPath(String value) {
        this.fieldNameOrPath = value;
    }

    /**
     * Gets the value of the nullsPosition property.
     * 
     * @return
     *     possible object is
     *     {@link OrderByNullsPositionType }
     *     
     */
    public OrderByNullsPositionType getNullsPosition() {
        return nullsPosition;
    }

    /**
     * Sets the value of the nullsPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderByNullsPositionType }
     *     
     */
    public void setNullsPosition(OrderByNullsPositionType value) {
        this.nullsPosition = value;
    }

    /**
     * Gets the value of the sortDirection property.
     * 
     * @return
     *     possible object is
     *     {@link OrderByDirectionType }
     *     
     */
    public OrderByDirectionType getSortDirection() {
        return sortDirection;
    }

    /**
     * Sets the value of the sortDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderByDirectionType }
     *     
     */
    public void setSortDirection(OrderByDirectionType value) {
        this.sortDirection = value;
    }

}
