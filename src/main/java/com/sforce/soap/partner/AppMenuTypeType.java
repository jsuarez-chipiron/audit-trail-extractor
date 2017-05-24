
package com.sforce.soap.partner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AppMenuType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AppMenuType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AppSwitcher"/>
 *     &lt;enumeration value="Salesforce1"/>
 *     &lt;enumeration value="NetworkTabs"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AppMenuType")
@XmlEnum
public enum AppMenuTypeType {

    @XmlEnumValue("AppSwitcher")
    APP_SWITCHER("AppSwitcher"),
    @XmlEnumValue("Salesforce1")
    SALESFORCE_1("Salesforce1"),
    @XmlEnumValue("NetworkTabs")
    NETWORK_TABS("NetworkTabs");
    private final String value;

    AppMenuTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AppMenuTypeType fromValue(String v) {
        for (AppMenuTypeType c: AppMenuTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
