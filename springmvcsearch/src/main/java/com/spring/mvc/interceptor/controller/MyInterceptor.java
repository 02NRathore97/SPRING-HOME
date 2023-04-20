package com.spring.mvc.interceptor.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

//public class MyInterceptor implements HandlerInterceptor {

public class MyInterceptor extends HandlerInterceptorAdapter {

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		System.out.println("This is preHandler.......");
		String name=request.getParameter("user");
		if(name.startsWith("n")) {
			response.setContentType("text/html");
			response.getWriter().println("Invalid name........Name should not start with n");
			return false;
		}
		return true;
	}

}
