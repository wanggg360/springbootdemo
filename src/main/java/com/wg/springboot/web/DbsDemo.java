package com.wg.springboot.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class DbsDemo {
	
	@RequestMapping("/")
	
	public String index()
	{
		return "welcome to springboot.";
	}
	
	public static void main(String[] args) {
		
		SpringApplication.run(DbsDemo.class, args);
	}

}
