
package com.sforce.soap.partner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for differenceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="differenceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DIFFERENT"/>
 *     &lt;enumeration value="NULL"/>
 *     &lt;enumeration value="SAME"/>
 *     &lt;enumeration value="SIMILAR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "differenceType")
@XmlEnum
public enum DifferenceTypeType {

    DIFFERENT,
    NULL,
    SAME,
    SIMILAR;

    public String value() {
        return name();
    }

    public static DifferenceTypeType fromValue(String v) {
        return valueOf(v);
    }

}
