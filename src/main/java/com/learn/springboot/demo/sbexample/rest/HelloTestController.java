package com.learn.springboot.demo.sbexample.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloTestController {

	@GetMapping("/")
	public String sayHello() {
		return ("Time on server is: "+LocalDateTime.now());
	}
}
