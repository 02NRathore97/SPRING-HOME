package com.rays.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
	private String subject;
	
	public Example() {
		// TODO Auto-generated constructor stub
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Example [ subjext : " +subject+"]";
	}
	
	@PostConstruct
	public void start() {
		System.out.println("Inside init method");
	}
	@PreDestroy
	public void end() {
		System.out.println("Inside destroy method");
	}
}
