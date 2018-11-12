package com.SpringRestDemo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DemoRestController {
	
	//add code for the /hello end point
	@GetMapping("/hello")
	public String getHello()
	{
		return "Hello World";
	}

}
