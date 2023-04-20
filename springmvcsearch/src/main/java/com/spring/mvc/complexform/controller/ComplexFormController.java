package com.spring.mvc.complexform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ComplexFormController {
	@RequestMapping("/form")
	public String form() {
		System.out.println("This is Form");
		return "complexForm";
	}

	
	@RequestMapping(path ="/processForm", method=RequestMethod.POST)
	public String processForm(@ModelAttribute("form") Form form,BindingResult result) {//bindingResult is used to handle errors
		if(result.hasErrors()) {
			return "complexForm";
		}
		System.out.println("This is Process Form");
		System.out.println(form);
		return "showData";
	}
	
	
}
