
package com.sforce.soap.partner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomLinkComponent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomLinkComponent">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:partner.soap.sforce.com}DescribeLayoutComponent">
 *       &lt;sequence>
 *         &lt;element name="customLink" type="{urn:partner.soap.sforce.com}DescribeLayoutButton"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomLinkComponent", propOrder = {
    "customLink"
})
public class CustomLinkComponentType
    extends DescribeLayoutComponentType
{

    @XmlElement(required = true)
    protected DescribeLayoutButtonType customLink;

    /**
     * Gets the value of the customLink property.
     * 
     * @return
     *     possible object is
     *     {@link DescribeLayoutButtonType }
     *     
     */
    public DescribeLayoutButtonType getCustomLink() {
        return customLink;
    }

    /**
     * Sets the value of the customLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescribeLayoutButtonType }
     *     
     */
    public void setCustomLink(DescribeLayoutButtonType value) {
        this.customLink = value;
    }

}
