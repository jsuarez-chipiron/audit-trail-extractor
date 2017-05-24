
package com.sforce.soap.partner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listViewIsSoqlCompatible.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="listViewIsSoqlCompatible">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TRUE"/>
 *     &lt;enumeration value="FALSE"/>
 *     &lt;enumeration value="ALL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "listViewIsSoqlCompatible")
@XmlEnum
public enum ListViewIsSoqlCompatibleType {

    TRUE,
    FALSE,
    ALL;

    public String value() {
        return name();
    }

    public static ListViewIsSoqlCompatibleType fromValue(String v) {
        return valueOf(v);
    }

}
