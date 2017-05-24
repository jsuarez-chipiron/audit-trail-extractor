
package com.sforce.soap.partner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GrammaticalNumber.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GrammaticalNumber">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Singular"/>
 *     &lt;enumeration value="Plural"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GrammaticalNumber")
@XmlEnum
public enum GrammaticalNumberType {

    @XmlEnumValue("Singular")
    SINGULAR("Singular"),
    @XmlEnumValue("Plural")
    PLURAL("Plural");
    private final String value;

    GrammaticalNumberType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GrammaticalNumberType fromValue(String v) {
        for (GrammaticalNumberType c: GrammaticalNumberType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
