package com.spring.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.mvc.model.User;
import com.spring.mvc.service.UserService;
@Controller
public class ContactController {
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commonDataForModel(Model model) {
		model.addAttribute("Header","This is Header");
		model.addAttribute("Footer", "This is Footer");
	}
	
	
	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}
	
//	@RequestMapping(path="processform", method=RequestMethod.POST)
//	public String processform(HttpServletRequest request) {
//		
//		String email = request.getParameter("email");
//		String username = request.getParameter("username");
//		String password = request.getParameter("password");
//		System.out.println("user email is = "+ email);
//		System.out.println("user name is = "+ username);
//		System.out.println("password is = "+ password);
//		return "";
//	}
	
//	@RequestMapping(path="processform", method=RequestMethod.POST)
//	public String processform(
//			@RequestParam("email")String email, 
//			@RequestParam("username")String username, 
//			@RequestParam("password")String password) {
//		
//		System.out.println("Email is = "+ email);
//		System.out.println("Name is = "+ username);
//		System.out.println("Password is = "+ password);
//		
//		return "";
//	}
	
//	@RequestMapping(path="processform", method=RequestMethod.POST)
//	public String processform(
//			@RequestParam("email")String email, 
//			@RequestParam("username")String username, 
//			@RequestParam("password")String password,
//			Model model) {
//		
//		model.addAttribute("email", email);
//		model.addAttribute("username", username);
//		model.addAttribute("password", password);
//		return "success";
//	}
	
	
	
//	@RequestMapping(path="processform", method=RequestMethod.POST)
//	public String processform(
//			@RequestParam("email")String email, 
//			@RequestParam("username")String username, 
//			@RequestParam("password")String password,
//			Model model) {
//		
//		User user = new User();
//		user.setEmail(email);
//		user.setUsername(username);
//		user.setPassword(password);
//		
//		model.addAttribute("user", user);
//		System.out.println(user);
//		return "success";
//	}
	
	
	
	@RequestMapping(path="processform", method=RequestMethod.POST)
	public String processform(@ModelAttribute User user) {
		System.out.println(user);
		
		if(user.getUsername().isBlank()) {
			return "redirect:/contact";
			
		}
		this.userService.createUser(user);
		return "success";
	}
}
