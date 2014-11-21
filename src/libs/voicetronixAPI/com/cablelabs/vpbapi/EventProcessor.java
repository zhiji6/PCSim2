/*
######################################################################################
##                                                                                  ##
## (c) 2006-2012 Cable Television Laboratories, Inc.  All rights reserved.  Any use ##
## of this documentation/package is subject to the terms and conditions of the      ##
## CableLabs License provided to you on download of the documentation/package.      ##
##                                                                                  ##
######################################################################################
*/
package com.cablelabs.vpbapi;

import com.cablelabs.utility.*;

public class EventProcessor implements UtilityListener {

	public void processEvent(UtilityEvent ue) {
		System.out.println(ue);
	}
}
