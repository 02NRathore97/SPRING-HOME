package com.rays.springcore.stereotype.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/rays/springcore/stereotype/annotation/stereotypeconfig.xml");

	//Student student =context.getBean("student", Student.class);
		Student student =context.getBean("stu", Student.class);
		System.out.println(student);
		System.out.println(student.getAddress());
		System.out.println(student.getAddress().getClass().getName());
		
		
		
	}

}
