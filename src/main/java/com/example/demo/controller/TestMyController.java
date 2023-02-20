package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/check/mywork")
public class TestMyController {
	
	
	@GetMapping("/again")
	public String checkMymethod() {
		
		return "Tested properly";
	}

}
