package com.AutomatedTask;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutoController {
	
	@GetMapping("/onesoft") 
	public String welcome1() {
		return "Welcome to Onesoft Technologies";
	}
	
	@GetMapping("/altawi") 
	public String welcome2() {
		return "Welcome to AL-TAWI";
	}

}
