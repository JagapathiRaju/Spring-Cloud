package com.techcrunchers.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableHystrix
@EnableHystrixDashboard
@SpringBootApplication
public class SpringbootHystrixApplication {
	@Bean
	RestTemplate restTemplate (){
		return new RestTemplate();
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringbootHystrixApplication.class, args);
	}
}
