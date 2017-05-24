
package com.sforce.soap.partner;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="nouns" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="100" minOccurs="0"/>
 *         &lt;element name="onlyRenamed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="includeFields" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "nouns",
    "onlyRenamed",
    "includeFields"
})
@XmlRootElement(name = "describeNouns")
public class DescribeNouns {

    protected List<String> nouns;
    protected boolean onlyRenamed;
    protected boolean includeFields;

    /**
     * Gets the value of the nouns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nouns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNouns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNouns() {
        if (nouns == null) {
            nouns = new ArrayList<String>();
        }
        return this.nouns;
    }

    /**
     * Gets the value of the onlyRenamed property.
     * 
     */
    public boolean isOnlyRenamed() {
        return onlyRenamed;
    }

    /**
     * Sets the value of the onlyRenamed property.
     * 
     */
    public void setOnlyRenamed(boolean value) {
        this.onlyRenamed = value;
    }

    /**
     * Gets the value of the includeFields property.
     * 
     */
    public boolean isIncludeFields() {
        return includeFields;
    }

    /**
     * Sets the value of the includeFields property.
     * 
     */
    public void setIncludeFields(boolean value) {
        this.includeFields = value;
    }

}
