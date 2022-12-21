package com.airbus.service1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Service1Application {

		public static void main(String[] args) {
			SpringApplication.run(Service1Application.class, args).registerShutdownHook();
		}

	    @Bean
	    RestTemplate restTemplate() {
	        return new RestTemplate();
	    }
	   

}
