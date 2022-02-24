package com.panchavadi.dockerdemo2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MyController {

	@GetMapping("test-docker")
	public String getData() {
		return "<b>Hello from my docker world!!!</b>";
	}
	
}
