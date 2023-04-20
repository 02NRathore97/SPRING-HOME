package com.spring.mvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path="/first", method=RequestMethod.GET)
public class HomeController {
//	@RequestMapping("/home")
//	public String home() {
//		System.out.println("This is Home url");
//		return "index";
//	}
	
	
	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("This is Home url");
		model.addAttribute("name", "Neeraj");
		model.addAttribute("id", 1);
		
		List<String> friends = new ArrayList<String>();
		friends.add("Amit");
		friends.add("Vinod");
		friends.add("Abhay");
		model.addAttribute("f",friends);
		
		return "index";
	}
	
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("This is about controller");
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("This is help controller");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name", "Neeraj");
		modelAndView.addObject("id", 1);
		
		
		List<Integer> marks = new ArrayList<Integer>();
		marks.add(101);
		marks.add(102);
		marks.add(103);
		marks.add(104);
		modelAndView.addObject("marks", marks);
		
		LocalDateTime time = LocalDateTime.now();
		modelAndView.addObject("time", time);
		
		 modelAndView.setViewName("help");
		return modelAndView;
	}
}
