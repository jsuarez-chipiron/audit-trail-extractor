
package com.sforce.soap.partner;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "InvalidSObjectFault", targetNamespace = "urn:fault.partner.soap.sforce.com")
public class InvalidSObjectFault
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private com.sforce.soap.partner.fault.InvalidSObjectFault faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public InvalidSObjectFault(String message, com.sforce.soap.partner.fault.InvalidSObjectFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public InvalidSObjectFault(String message, com.sforce.soap.partner.fault.InvalidSObjectFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.sforce.soap.partner.fault.InvalidSObjectFault
     */
    public com.sforce.soap.partner.fault.InvalidSObjectFault getFaultInfo() {
        return faultInfo;
    }

}
