package com.spring.mvc.interceptor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@RequestMapping("/page")
	public String home() {
		return "page";
	}
	
	//handling for request
	@RequestMapping("/welcome")
	public String welcome(@RequestParam("user") String name, Model model) {
		System.out.println(name);
		model.addAttribute("name",name);
		return "welcome";
		
		
	}
}
