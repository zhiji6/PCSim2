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
 * File Name     : InvalidArgumentException.java
 * Author        : Phelim O'Doherty
 *
 *  HISTORY
 *  Version   Date      Author              Comments
 *  1.1     08/10/2002  Phelim O'Doherty    
 *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package javax.sip;

/**
 * This exception class is thrown by an implementation when given an invalid
 * argument such as a invalid numerical value.
 */
public class InvalidArgumentException extends Exception {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * Create an <code>InvalidArgumentException</code> with no detail message.
     */
    public InvalidArgumentException() {}

    /**
     * Create an <code>InvalidArgumentException</code> with a detail message.
     *
     * @param message the detail message.
     */
    public InvalidArgumentException(String message) {
        super(message);
    }

    /**
    * Constructs a new <code>InvalidArgumentException</code> with the
    * specified error message and specialized cause that triggered this error
    * condition.
    *
    * @param  message the detail of the error message
    * @param  cause  the specialized cause that triggered this exception
    */
    public InvalidArgumentException(String message, Throwable cause) {
        super(message);
        m_Cause = cause;
    }

    /**
     * Returns the cause of this throwable or null if the cause is 
     * nonexistent or unknown. (The cause is the throwable that caused this 
     * throwable to get thrown.) This implementation returns the cause that 
     * was supplied via the constructor requiring a Throwable.
     *
     * @return the cause of this throwable or null if the cause is 
     * nonexistent or unknown.
     */
    public Throwable getCause() {
   		return(m_Cause);
    }

    /**
     * The specialized cause that triggered this Exception. This cause
     * informs an application of the underlying implementation problem that
     * triggered this Exception.
     */
    protected Throwable m_Cause = null;    
    
}
