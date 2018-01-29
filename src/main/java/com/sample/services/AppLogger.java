package com.sample.services;

public class AppLogger {
	
	private String className;

	public AppLogger(String className) {
		this.className = className;
	}
	
	public void logInfo(String methodName, String message) {
		String msg = "[INFO] " + this.getClassName() + "." + methodName + "() :: " + message;
		System.out.println(msg);
	}
	
	public void logWarm(String methodName, String message) {
		String msg = "[WARM] " + this.getClassName() + "." + methodName + "() :: " + message;
		System.out.println(msg);
	}
	
	public void logError(String methodName, String message) {
		String msg = "[ERROR] " + this.getClassName() + "." + methodName + "() :: " + message;
		System.out.println(msg);
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	
}
