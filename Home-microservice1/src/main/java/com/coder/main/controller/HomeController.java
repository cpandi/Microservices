package com.coder.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class HomeController {

	@Autowired
	RestTemplate restTemplate;

	@GetMapping("/home")
	@HystrixCommand(fallbackMethod = "handleProductServiceDown")
	public String home() {
		// return "Home Controller";

		// String product = restTemplate.getForObject("http://localhost:8082/product",
		// String.class);
		String product = restTemplate.getForObject("http://PRODUCT-MICROSERVICE/product", String.class);
		System.out.println("Home::::" + product);
		return product;
	}

	public String handleProductServiceDown() {
		return "called as fallback method";
	}

}
