package com.in28mins.microservice.currencyconversionservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableFeignClients
public class CurrencyConversionServiceInvokeFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConversionServiceInvokeFeignApplication.class, args);
	}
	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
}
