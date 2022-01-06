package com.coder.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Product1MicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Product1MicroserviceApplication.class, args);
	}

}
