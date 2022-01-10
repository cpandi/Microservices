package com.coder.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@GetMapping("/product")
	public String product() {
		System.out.println("Coming product...");
		return "Product Service called by Load balanced with circuit breaker.......";
	}
}


