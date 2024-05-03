package com.in28mins.microservice.currencyconversionservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CurrencyConversionServiceInvokeApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConversionServiceInvokeApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
}
