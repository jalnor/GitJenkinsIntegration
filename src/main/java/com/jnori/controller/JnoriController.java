package com.jnori.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JnoriController {

	@GetMapping("/")
	public String getMessage() {
		return "Welcome to GitAWSCodeDeploy with Jenkins and Maven";
	}
	@GetMapping("/awsStore")
	public String getAWS() {
		return "Welcome to AWS";
	}
	@GetMapping("/payNow")
	public String payNow() {
		return "Pay me now!";
	}
}