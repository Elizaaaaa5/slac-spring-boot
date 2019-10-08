package com.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Component
public class SampleApplication {

	private static Logger logger = LoggerFactory.getLogger(SampleApplication.class);

	public static void main(String[] args) {
		logger.info("Hello, I am an info logger.");
		SpringApplication.run(SampleApplication.class, args);
	}

}
