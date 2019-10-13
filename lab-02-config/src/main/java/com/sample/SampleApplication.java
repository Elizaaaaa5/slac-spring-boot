package com.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SampleApplication {

	@Value("${application.properties}")
	private static String propertyKey = "property-key";

	private static final Logger logger = LoggerFactory.getLogger(SampleApplication.class);

	public static void main(String[] args) {
		logMe();
		SpringApplication.run(SampleApplication.class, args);
	}

	@PostConstruct
	public static void logMe(){
		logger.info(propertyKey);
	}
}
