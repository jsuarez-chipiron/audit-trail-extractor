
package com.sforce.soap.partner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for layoutComponentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="layoutComponentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ReportChart"/>
 *     &lt;enumeration value="Field"/>
 *     &lt;enumeration value="Separator"/>
 *     &lt;enumeration value="SControl"/>
 *     &lt;enumeration value="EmptySpace"/>
 *     &lt;enumeration value="VisualforcePage"/>
 *     &lt;enumeration value="ExpandedLookup"/>
 *     &lt;enumeration value="AuraComponent"/>
 *     &lt;enumeration value="Canvas"/>
 *     &lt;enumeration value="CustomLink"/>
 *     &lt;enumeration value="AnalyticsCloud"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "layoutComponentType")
@XmlEnum
public enum LayoutComponentTypeType {

    @XmlEnumValue("ReportChart")
    REPORT_CHART("ReportChart"),
    @XmlEnumValue("Field")
    FIELD("Field"),
    @XmlEnumValue("Separator")
    SEPARATOR("Separator"),
    @XmlEnumValue("SControl")
    S_CONTROL("SControl"),
    @XmlEnumValue("EmptySpace")
    EMPTY_SPACE("EmptySpace"),
    @XmlEnumValue("VisualforcePage")
    VISUALFORCE_PAGE("VisualforcePage"),
    @XmlEnumValue("ExpandedLookup")
    EXPANDED_LOOKUP("ExpandedLookup"),
    @XmlEnumValue("AuraComponent")
    AURA_COMPONENT("AuraComponent"),
    @XmlEnumValue("Canvas")
    CANVAS("Canvas"),
    @XmlEnumValue("CustomLink")
    CUSTOM_LINK("CustomLink"),
    @XmlEnumValue("AnalyticsCloud")
    ANALYTICS_CLOUD("AnalyticsCloud");
    private final String value;

    LayoutComponentTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LayoutComponentTypeType fromValue(String v) {
        for (LayoutComponentTypeType c: LayoutComponentTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
