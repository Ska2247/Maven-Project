package com.logger;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Basic_Config {

	public static Logger log = Logger.getLogger(Basic_Config.class);

	public static void main(String[] args) {

		BasicConfigurator.configure();

		log.debug("Debug");

		log.info("info");

		log.warn("warn");

		log.error("error");

		log.fatal("fatal");

	}

}
