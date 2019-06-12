package com.jcg.logging;

import org.apache.logging.log4j.Level;

public class Log4j2Example {
	
	public static void main(String[] args) {
		CommonLogger.logs("Log4j2Example:main This Will Be Printed On Debug",Level.DEBUG);
		CommonLogger.logs("Log4j2Example:main This Will Be Printed On Info",Level.INFO);
		CommonLogger.logs("Log4j2Example:main This Will Be Printed On Error",Level.ERROR);
		EnablingLoggerAtRunTIme.checkLogger();
		CommonLogger.logs("Log4j2Example:main This Will Be Printed On Fatal",Level.FATAL);
		CommonLogger.logs("Log4j2Example:main This Will Be Printed On Warn",Level.WARN);
	}
}