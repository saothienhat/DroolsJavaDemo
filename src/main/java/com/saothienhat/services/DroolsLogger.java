package com.saothienhat.services;

import org.drools.core.spi.KnowledgeHelper;

/**
 * @author saothienhat@gmail.com
 *
 */
public class DroolsLogger {
	public static void logDroolsInfo(final KnowledgeHelper drools, final String message) {
		String info = "[INFO] \n" 
				+ "\tTriggered Rule: " + drools.getRule().getName() + "\n"
				+ "\tMessage: " + message;
		System.out.println(info);
	}

	public static void logDroolsError(final KnowledgeHelper drools, final String message) {
		String info = "[ERROR] \n" 
				+ "\tTriggered Rule: " + drools.getRule().getName() + "\n" 
				+ "\tMessage: " + message;
		System.out.println(info);
	}

}
