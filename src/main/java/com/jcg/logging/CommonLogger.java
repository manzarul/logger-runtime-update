package com.jcg.logging;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;

public class CommonLogger {

	private static Logger LOG = LogManager.getRootLogger();
	static {
		Configurator.setLevel(LOG.getName(), Level.FATAL);
		Configurator.setRootLevel(Level.FATAL);
	}

	public static void logs(String message, Level level) {
		if (level.name().equalsIgnoreCase("DEBUG")) {
			debug(message);
		} else if (level.name().equalsIgnoreCase("INFO")) {
			info(message);
		} else if (level.name().equalsIgnoreCase("ERROR")) {
			error(message);
		} else if (level.name().equalsIgnoreCase("WARN")) {
			warn(message);
		} else {
			fatal(message);
		}
	}

	public static void debug(String message) {
		LOG.debug(message);
	}

	public static void info(String message) {
		LOG.info(message);
	}

	public static void error(String message) {
		LOG.error(message);
	}

	public static void fatal(String message) {
		LOG.fatal(message);
	}

	public static void warn(String message) {
		LOG.warn(message);
	}

}
