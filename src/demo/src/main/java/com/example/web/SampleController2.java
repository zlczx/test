package com.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SampleController2 {
    @RequestMapping(value="/test", method=RequestMethod.GET)
    public String home() {
        return "/test1";
    }
    
    @RequestMapping(value = "/fetch/{id}", method = RequestMethod.GET)  
    String getDynamicUriValue(@PathVariable String id) {  
        System.out.println("ID is " + id);  
        return "Dynamic URI parameter fetched" + id;  
    }
    
}