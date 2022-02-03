package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloDocker {

	@GetMapping(value = "hello")
	public String sayHelloToDocker() {
		return "Hello Docker!!!!";
	}
}
