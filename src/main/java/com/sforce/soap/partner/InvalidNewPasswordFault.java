
package com.sforce.soap.partner;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "InvalidNewPasswordFault", targetNamespace = "urn:fault.partner.soap.sforce.com")
public class InvalidNewPasswordFault
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private com.sforce.soap.partner.fault.InvalidNewPasswordFault faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public InvalidNewPasswordFault(String message, com.sforce.soap.partner.fault.InvalidNewPasswordFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public InvalidNewPasswordFault(String message, com.sforce.soap.partner.fault.InvalidNewPasswordFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.sforce.soap.partner.fault.InvalidNewPasswordFault
     */
    public com.sforce.soap.partner.fault.InvalidNewPasswordFault getFaultInfo() {
        return faultInfo;
    }

}
