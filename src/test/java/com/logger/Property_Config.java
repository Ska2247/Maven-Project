package com.logger;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Property_Config {

	public static Logger log = Logger.getLogger(Property_Config.class);

	public static void main(String[] args) {

		PropertyConfigurator.configure("log4j.properties");

		log.debug("Debug");

		log.info("info");

		log.warn("warn");

		log.error("error");

		log.fatal("fatal");

	}
}