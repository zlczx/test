package com.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class DemoController {
	
	@RestController
	public class HelloWorldController {
	    @RequestMapping("/hello")
	    public String index() {
	        return "Hello World";
	    }
	}
}
