package com.spring.mvc.search.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
	
	
	@RequestMapping("/user/{userId}/{userName}")
	public String getUserDetails(
			@PathVariable("userId") int userId,
			@PathVariable("userName") String userName) {
		
		System.out.println(userId);
		System.out.println(userName);
		System.out.println("Going to home view");
		return "home";
		}
	
	
	
	
	
	
	
	@RequestMapping("/home")
	public String home() {
		System.out.println("Going to home view");
		
		String str = null;
		//System.out.println(str.length());
		return "home";
		}
//	@ExceptionHandler(value=NullPointerException.class)
//	public String exceptionHandlerNull() {
//		return "null_page";
//		
//	}
//	@ExceptionHandler(value=NumberFormatException.class)
//	public String exceptionHandlerNumberformat() {
//		return "null_page";
//		
//	}
//	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
//	@ExceptionHandler(value=Exception.class)
//	public String exceptionHandlerGeneric() {
//		return "null_page";
//		
//	}
//	
	
	
	
	
	
	
	
	
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox")String query) {	
		RedirectView redirectView=new RedirectView();
		String url = null;
		if(query.isBlank()) {
			redirectView.setUrl("home");
		}else {
			url="https://www.google.com/search?q="+query;
			redirectView.setUrl(url);
		}
		return redirectView;
		}
}
