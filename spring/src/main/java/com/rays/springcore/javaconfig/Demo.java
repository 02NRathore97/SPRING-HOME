package com.rays.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext(
//				"com/rays/springcore/javaconfig/config.xml");
//		Student student = context.getBean("student",Student.class);
//		System.out.println(student);
//		context.close();
		
		
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//				"com/rays/springcore/javaconfig/config.xml");
//		Student student = context.getBean("student",Student.class);
//		System.out.println(student);
//		context.close();
		
		
		
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		Student student = context.getBean("getStudent",Student.class);
		System.out.println(student);
		student.study();
		
	}

}
