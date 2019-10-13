package com.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.management.MBeanServer;

@SpringBootApplication
public class SampleApplication {

	@Value("${application.properties}")
	private static String propertyKey = "property-key";

	private static final Logger logger = LoggerFactory.getLogger(SampleApplication.class);

	public static void main(String[] args) {
		logMe();
		logLocal();
		logNonDevl();
		SpringApplication.run(SampleApplication.class, args);
	}

	@PostConstruct
	public static void logMe(){
		logger.info(propertyKey);
	}

	@Profile("local")
	public static void logLocal(){
		logger.info("Hello, I am profile local");
	}

	@Profile("!devl")
	public static void logNonDevl(){
		logger.info("Hello, I am profile non devl.");
	}

}
