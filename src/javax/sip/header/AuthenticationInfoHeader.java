/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Unpublished - rights reserved under the Copyright Laws of the United States.
 * Copyright � 2003 Sun Microsystems, Inc. All rights reserved.
 *
 * U.S. Government Rights - Commercial software. Government users are subject 
 * to the Sun Microsystems, Inc. standard license agreement and applicable 
 * provisions of the FAR and its supplements.
 *
 * Use is subject to license terms.
 *
 * This distribution may include materials developed by third parties. Sun, 
 * Sun Microsystems, the Sun logo, Java, Jini and JAIN are trademarks or 
 * registered trademarks of Sun Microsystems, Inc. in the U.S. and other 
 * countries.
 *
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *
 * Module Name   : JAIN SIP Specification
 * File Name     : AuthenticationInfoHeader.java
 * Author        : Phelim O'Doherty
 *
 *  HISTORY
 *  Version   Date      Author              Comments
 *  1.1     08/10/2002  Phelim O'Doherty    Initial version
 *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package javax.sip.header;

import java.text.ParseException;

/**
 * The Authentication-Info header field provides for mutual
 * authentication with HTTP Digest. A UAS MAY include this header field
 * in a 2xx response to a request that was successfully authenticated
 * using digest based on the Authorization header field.
 * <p>
 * For Example:<br>
 * <code>Authentication-Info: nextnonce="47364c23432d2e131a5fb210812c"</code>
 *
 * @version 1.1
 * @author Sun Microsystems
 */
public interface AuthenticationInfoHeader extends Parameters, Header {

    /**
     * Sets the NextNonce of the AuthenticationInfoHeader to the <var>nextNonce</var>
     * parameter value. 
     *
     * @param nextNonce - the new nextNonce String of this AuthenticationInfoHeader.
     * @throws ParseException which signals that an error has been reached
     * unexpectedly while parsing the nextNonce value.
     * @since v1.1
     */
    public void setNextNonce(String nextNonce) throws ParseException;

    /**
     * Returns the nextNonce value of this AuthenticationInfoHeader. 
     *
     * @return the String representing the nextNonce information, null if value is
     * not set.
     * @since v1.1
     */
    public String getNextNonce();   
    
    /**
     * Sets the Qop value of the AuthenticationInfoHeader to the new 
     * <var>qop</var> parameter value.
     *
     * @param qop - the new Qop string of this AuthenticationInfoHeader.
     * @throws ParseException which signals that an error has been reached
     * unexpectedly while parsing the Qop value.
     * @since v1.1
     */
    public void setQop(String qop) throws ParseException;

    /**
     * Returns the messageQop value of this AuthenticationInfoHeader.
     *
     * @return the string representing the messageQop information, null if the 
     * value is not set.
     * @since v1.1
     */
    public String getQop();        

    /**
     * Sets the CNonce of the AuthenticationInfoHeader to the <var>cNonce</var>
     * parameter value. 
     *
     * @param cNonce - the new cNonce String of this AuthenticationInfoHeader.
     * @throws ParseException which signals that an error has been reached
     * unexpectedly while parsing the cNonce value.
     * @since v1.1
     */
    public void setCNonce(String cNonce) throws ParseException;

    /**
     * Returns the CNonce value of this AuthenticationInfoHeader. 
     *
     * @return the String representing the cNonce information, null if value is
     * not set.
     * @since v1.1
     */
    public String getCNonce();  
    
    /**
     * Sets the Nonce Count of the AuthenticationInfoHeader to the <var>nonceCount</var>
     * parameter value. 
     *
     * @param nonceCount - the new nonceCount integer of this AuthenticationInfoHeader.
     * @throws ParseException which signals that an error has been reached
     * unexpectedly while parsing the nonceCount value.
     * @since v1.1
     */
    // PC 2.0 - Changed this method to receive a String for the nc parameter
	//  to maintain leading zeros
	//public void setNonceCount(int nonceCount) throws ParseException {
    public void setNonceCount(String nonceCount) throws ParseException;

    /**
     * Returns the Nonce Count value of this AuthenticationInfoHeader. 
     *
     * @return the integer representing the nonceCount information, -1 if value is
     * not set.
     * @since v1.1
     */
    //  PC 2.0 - Changed this method to retrieve the nc parameter as 
	// a string to maintain leading zeros
	//public int getNonceCount() {
    public String getNonceCount();    
    
    /**
     * Sets the Response of the AuthenticationInfoHeader to the new <var>response</var> 
     * parameter value.
     *
     * @param response - the new response String of this AuthenticationInfoHeader.
     * @throws ParseException which signals that an error has been reached
     * unexpectedly while parsing the Response.
     * @since v1.1
     */
    public void setResponse(String response) throws ParseException;

    /**
     * Returns the Response value of this AuthenticationInfoHeader.
     *
     * @return the String representing the Response information.
     * @since v1.1
     */
    public String getResponse();    
    
    /**
     * Name of the AlertInfoHeader
     */
    public final static String NAME = "Authentication-Info";

}

