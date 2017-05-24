
package com.sforce.soap.partner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TabOrderType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TabOrderType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LeftToRight"/>
 *     &lt;enumeration value="TopToBottom"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TabOrderType")
@XmlEnum
public enum TabOrderTypeType {

    @XmlEnumValue("LeftToRight")
    LEFT_TO_RIGHT("LeftToRight"),
    @XmlEnumValue("TopToBottom")
    TOP_TO_BOTTOM("TopToBottom");
    private final String value;

    TabOrderTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TabOrderTypeType fromValue(String v) {
        for (TabOrderTypeType c: TabOrderTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
