
package com.sforce.soap.partner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Gender.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Gender">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Neuter"/>
 *     &lt;enumeration value="Masculine"/>
 *     &lt;enumeration value="Feminine"/>
 *     &lt;enumeration value="AnimateMasculine"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Gender")
@XmlEnum
public enum GenderType {

    @XmlEnumValue("Neuter")
    NEUTER("Neuter"),
    @XmlEnumValue("Masculine")
    MASCULINE("Masculine"),
    @XmlEnumValue("Feminine")
    FEMININE("Feminine"),
    @XmlEnumValue("AnimateMasculine")
    ANIMATE_MASCULINE("AnimateMasculine");
    private final String value;

    GenderType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GenderType fromValue(String v) {
        for (GenderType c: GenderType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
