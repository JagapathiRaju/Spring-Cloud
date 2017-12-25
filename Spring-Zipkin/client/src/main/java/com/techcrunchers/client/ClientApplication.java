package com.techcrunchers.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ClientApplication {

	/***
	 * Spring Cloud will interset this Bean to Add Traces
	 *
	 * @return
	 */
	@Bean
	RestTemplate restTemplate (){
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}
}
