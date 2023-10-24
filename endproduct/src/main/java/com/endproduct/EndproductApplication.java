package com.endproduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class EndproductApplication {

	public static void main(String[] args) {
		SpringApplication.run(EndproductApplication.class, args);
	}
	
	@Bean
	public RestTemplate restTemp() {
		
		return new RestTemplate();
		
	}

}
