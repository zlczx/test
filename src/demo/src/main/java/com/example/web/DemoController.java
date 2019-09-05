package com.example.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class DemoController {
	
	@RestController
	public class HelloWorldController {
    	 
    	@Autowired
    	StringRedisTemplate stringRedisTemplate;
    	
	    @RequestMapping("/hello")
	    public String index() {
	    	
	    	 String studentList= String.valueOf(stringRedisTemplate.opsForValue().get("00001001000000000021"));
	    	
	        return "Hello World:" + studentList;
	    }
	}
}
