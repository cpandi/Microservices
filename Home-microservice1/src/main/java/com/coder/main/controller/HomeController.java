package com.coder.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HomeController {

	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/home")
	public String home() {
		//return "Home Controller";
		//String product = restTemplate.getForObject("http://DESKTOP-GBG5C18:Product-microservice:8082", String.class);
		
		String product = restTemplate.getForObject("http://localhost:8082/product", String.class);
		return product;
	}
}
