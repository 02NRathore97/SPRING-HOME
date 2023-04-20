package com.rays.springcore.javaconfig;
//this class will remove XML file

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.rays.springcore.javaconfig")
public class JavaConfig {

	@Bean
	public Student getStudent() {
		Student student = new Student();
		return student;
	}
	
}
