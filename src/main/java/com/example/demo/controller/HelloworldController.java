package com.example.demo.controller;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;  
@RestController  
public class HelloworldController {
	@RequestMapping("/hello")  
	public String hello()   
	{  
	return "Hello Great World-1";  
	}  
}
