
package com.sforce.soap.partner;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "UnexpectedErrorFault", targetNamespace = "urn:fault.partner.soap.sforce.com")
public class UnexpectedErrorFault
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private com.sforce.soap.partner.fault.UnexpectedErrorFault faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public UnexpectedErrorFault(String message, com.sforce.soap.partner.fault.UnexpectedErrorFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public UnexpectedErrorFault(String message, com.sforce.soap.partner.fault.UnexpectedErrorFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.sforce.soap.partner.fault.UnexpectedErrorFault
     */
    public com.sforce.soap.partner.fault.UnexpectedErrorFault getFaultInfo() {
        return faultInfo;
    }

}
