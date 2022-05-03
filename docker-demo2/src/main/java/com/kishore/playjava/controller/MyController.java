package com.kishore.playjava.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/test-docker")
	public String getData() {
		return "Welcome to first docker demo project live session with Kishore Kumar";
	}
}
