package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody("/")
public class HelloController {

	
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Well, Hello Beautiful.....";
	}
}
