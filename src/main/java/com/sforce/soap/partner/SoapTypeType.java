
package com.sforce.soap.partner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for soapType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="soapType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="tns:ID"/>
 *     &lt;enumeration value="xsd:base64Binary"/>
 *     &lt;enumeration value="xsd:boolean"/>
 *     &lt;enumeration value="xsd:double"/>
 *     &lt;enumeration value="xsd:int"/>
 *     &lt;enumeration value="xsd:string"/>
 *     &lt;enumeration value="xsd:date"/>
 *     &lt;enumeration value="xsd:dateTime"/>
 *     &lt;enumeration value="xsd:time"/>
 *     &lt;enumeration value="urn:location"/>
 *     &lt;enumeration value="urn:address"/>
 *     &lt;enumeration value="xsd:anyType"/>
 *     &lt;enumeration value="urn:RelationshipReferenceTo"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "soapType")
@XmlEnum
public enum SoapTypeType {

    @XmlEnumValue("tns:ID")
    TNS___ID("tns:ID"),
    @XmlEnumValue("xsd:base64Binary")
    XSD___BASE_64_BINARY("xsd:base64Binary"),
    @XmlEnumValue("xsd:boolean")
    XSD___BOOLEAN("xsd:boolean"),
    @XmlEnumValue("xsd:double")
    XSD___DOUBLE("xsd:double"),
    @XmlEnumValue("xsd:int")
    XSD___INT("xsd:int"),
    @XmlEnumValue("xsd:string")
    XSD___STRING("xsd:string"),
    @XmlEnumValue("xsd:date")
    XSD___DATE("xsd:date"),
    @XmlEnumValue("xsd:dateTime")
    XSD___DATE_TIME("xsd:dateTime"),
    @XmlEnumValue("xsd:time")
    XSD___TIME("xsd:time"),
    @XmlEnumValue("urn:location")
    URN___LOCATION("urn:location"),
    @XmlEnumValue("urn:address")
    URN___ADDRESS("urn:address"),
    @XmlEnumValue("xsd:anyType")
    XSD___ANY_TYPE("xsd:anyType"),
    @XmlEnumValue("urn:RelationshipReferenceTo")
    URN___RELATIONSHIP_REFERENCE_TO("urn:RelationshipReferenceTo");
    private final String value;

    SoapTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SoapTypeType fromValue(String v) {
        for (SoapTypeType c: SoapTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
