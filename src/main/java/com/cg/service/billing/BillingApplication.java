package com.cg.service.billing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.cg.service.billing.*"})
public class BillingApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(BillingApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(BillingApplication.class, args);
		LOGGER.info("Billing service started...");
	}

}
