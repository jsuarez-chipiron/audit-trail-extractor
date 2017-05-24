
package com.sforce.soap.partner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CaseType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CaseType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Nominative"/>
 *     &lt;enumeration value="Accusative"/>
 *     &lt;enumeration value="Genitive"/>
 *     &lt;enumeration value="Dative"/>
 *     &lt;enumeration value="Inessive"/>
 *     &lt;enumeration value="Elative"/>
 *     &lt;enumeration value="Illative"/>
 *     &lt;enumeration value="Adessive"/>
 *     &lt;enumeration value="Ablative"/>
 *     &lt;enumeration value="Allative"/>
 *     &lt;enumeration value="Essive"/>
 *     &lt;enumeration value="Translative"/>
 *     &lt;enumeration value="Partitive"/>
 *     &lt;enumeration value="Objective"/>
 *     &lt;enumeration value="Subjective"/>
 *     &lt;enumeration value="Instrumental"/>
 *     &lt;enumeration value="Prepositional"/>
 *     &lt;enumeration value="Locative"/>
 *     &lt;enumeration value="Vocative"/>
 *     &lt;enumeration value="Sublative"/>
 *     &lt;enumeration value="Superessive"/>
 *     &lt;enumeration value="Delative"/>
 *     &lt;enumeration value="Causalfinal"/>
 *     &lt;enumeration value="Essiveformal"/>
 *     &lt;enumeration value="Termanative"/>
 *     &lt;enumeration value="Distributive"/>
 *     &lt;enumeration value="Ergative"/>
 *     &lt;enumeration value="Adverbial"/>
 *     &lt;enumeration value="Abessive"/>
 *     &lt;enumeration value="Comitative"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CaseType")
@XmlEnum
public enum CaseTypeType {

    @XmlEnumValue("Nominative")
    NOMINATIVE("Nominative"),
    @XmlEnumValue("Accusative")
    ACCUSATIVE("Accusative"),
    @XmlEnumValue("Genitive")
    GENITIVE("Genitive"),
    @XmlEnumValue("Dative")
    DATIVE("Dative"),
    @XmlEnumValue("Inessive")
    INESSIVE("Inessive"),
    @XmlEnumValue("Elative")
    ELATIVE("Elative"),
    @XmlEnumValue("Illative")
    ILLATIVE("Illative"),
    @XmlEnumValue("Adessive")
    ADESSIVE("Adessive"),
    @XmlEnumValue("Ablative")
    ABLATIVE("Ablative"),
    @XmlEnumValue("Allative")
    ALLATIVE("Allative"),
    @XmlEnumValue("Essive")
    ESSIVE("Essive"),
    @XmlEnumValue("Translative")
    TRANSLATIVE("Translative"),
    @XmlEnumValue("Partitive")
    PARTITIVE("Partitive"),
    @XmlEnumValue("Objective")
    OBJECTIVE("Objective"),
    @XmlEnumValue("Subjective")
    SUBJECTIVE("Subjective"),
    @XmlEnumValue("Instrumental")
    INSTRUMENTAL("Instrumental"),
    @XmlEnumValue("Prepositional")
    PREPOSITIONAL("Prepositional"),
    @XmlEnumValue("Locative")
    LOCATIVE("Locative"),
    @XmlEnumValue("Vocative")
    VOCATIVE("Vocative"),
    @XmlEnumValue("Sublative")
    SUBLATIVE("Sublative"),
    @XmlEnumValue("Superessive")
    SUPERESSIVE("Superessive"),
    @XmlEnumValue("Delative")
    DELATIVE("Delative"),
    @XmlEnumValue("Causalfinal")
    CAUSALFINAL("Causalfinal"),
    @XmlEnumValue("Essiveformal")
    ESSIVEFORMAL("Essiveformal"),
    @XmlEnumValue("Termanative")
    TERMANATIVE("Termanative"),
    @XmlEnumValue("Distributive")
    DISTRIBUTIVE("Distributive"),
    @XmlEnumValue("Ergative")
    ERGATIVE("Ergative"),
    @XmlEnumValue("Adverbial")
    ADVERBIAL("Adverbial"),
    @XmlEnumValue("Abessive")
    ABESSIVE("Abessive"),
    @XmlEnumValue("Comitative")
    COMITATIVE("Comitative");
    private final String value;

    CaseTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CaseTypeType fromValue(String v) {
        for (CaseTypeType c: CaseTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
