
package com.sforce.soap.partner;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "MalformedSearchFault", targetNamespace = "urn:fault.partner.soap.sforce.com")
public class MalformedSearchFault
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private com.sforce.soap.partner.fault.MalformedSearchFault faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public MalformedSearchFault(String message, com.sforce.soap.partner.fault.MalformedSearchFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public MalformedSearchFault(String message, com.sforce.soap.partner.fault.MalformedSearchFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.sforce.soap.partner.fault.MalformedSearchFault
     */
    public com.sforce.soap.partner.fault.MalformedSearchFault getFaultInfo() {
        return faultInfo;
    }

}
