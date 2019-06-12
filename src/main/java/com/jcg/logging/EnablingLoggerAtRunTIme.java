package com.jcg.logging;

import org.apache.logging.log4j.Level;

public class EnablingLoggerAtRunTIme {
	
	public static void checkLogger() {
		CommonLogger.logs("EnablingLoggerAtRunTIme:checkLogger This Will Be Printed On Debug",Level.DEBUG);
		CommonLogger.logs("EnablingLoggerAtRunTIme:checkLogger This Will Be Printed On Info",Level.INFO);
		CommonLogger.logs("EnablingLoggerAtRunTIme:checkLogger This Will Be Printed On Error",Level.ERROR);
		CommonLogger.logs("EnablingLoggerAtRunTIme:checkLogger This Will Be Printed On Warn",Level.WARN);
		checkLogger_1();
	 }
	
	public static void checkLogger_1() {
		CommonLogger.logs("EnablingLoggerAtRunTIme:checkLogger_1 This Will Be Printed On Error",Level.ERROR);
		CommonLogger.logs("EnablingLoggerAtRunTIme:checkLogger_1 This Will Be Printed On Fatal",Level.FATAL);
	}
	

}
