package com.jnori.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JnoriController {

	@GetMapping("/")
	public String getMessage() {
		return "I am making critical change be careful";
	}
}