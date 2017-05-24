
package com.sforce.soap.partner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Article.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Article">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Indefinite"/>
 *     &lt;enumeration value="Definite"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Article")
@XmlEnum
public enum ArticleType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Indefinite")
    INDEFINITE("Indefinite"),
    @XmlEnumValue("Definite")
    DEFINITE("Definite");
    private final String value;

    ArticleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ArticleType fromValue(String v) {
        for (ArticleType c: ArticleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
