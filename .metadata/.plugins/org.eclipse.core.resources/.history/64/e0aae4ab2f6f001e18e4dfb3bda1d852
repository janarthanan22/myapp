package com.logg4jj;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class Logg4jjApplication {
	static Logger log=Logger.getLogger(Logg4jjApplication.class);

	public static void main(String[] args) {
		
		SpringApplication.run(Logg4jjApplication.class, args);
		//BasicConfigurator.configure();
		PropertyConfigurator.configure("log4j.properties");
		log.info("Information");
		log.error("Error");
		log.warn("warning");
		log.fatal("Critical error");
		log.debug("Debugging");
	}

}
