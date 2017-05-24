
package com.sforce.soap.partner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeedLayoutFilterType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FeedLayoutFilterType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AllUpdates"/>
 *     &lt;enumeration value="FeedItemType"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FeedLayoutFilterType")
@XmlEnum
public enum FeedLayoutFilterTypeType {

    @XmlEnumValue("AllUpdates")
    ALL_UPDATES("AllUpdates"),
    @XmlEnumValue("FeedItemType")
    FEED_ITEM_TYPE("FeedItemType");
    private final String value;

    FeedLayoutFilterTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FeedLayoutFilterTypeType fromValue(String v) {
        for (FeedLayoutFilterTypeType c: FeedLayoutFilterTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
