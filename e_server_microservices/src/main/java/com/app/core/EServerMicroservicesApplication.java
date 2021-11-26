package com.app.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer 
public class EServerMicroservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(EServerMicroservicesApplication.class, args);
	}

}
