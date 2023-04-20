package com.rays.springcore.beanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/rays/springcore/beanscope/scopeconfig.xml");

	
//		Student student =context.getBean("stu", Student.class);
//		System.out.println(student.hashCode());
//		Student student1 =context.getBean("stu", Student.class);
//		System.out.println(student1.hashCode());
		
		Teacher teacher =context.getBean("teacher", Teacher.class);
		Teacher teacher1 =context.getBean("teacher", Teacher.class);
		System.out.println(teacher.hashCode());
		System.out.println(teacher1.hashCode());
	}

}
