
package com.sforce.soap.partner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WebLinkPosition.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WebLinkPosition">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="fullScreen"/>
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="topLeft"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WebLinkPosition")
@XmlEnum
public enum WebLinkPositionType {

    @XmlEnumValue("fullScreen")
    FULL_SCREEN("fullScreen"),
    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("topLeft")
    TOP_LEFT("topLeft");
    private final String value;

    WebLinkPositionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WebLinkPositionType fromValue(String v) {
        for (WebLinkPositionType c: WebLinkPositionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
