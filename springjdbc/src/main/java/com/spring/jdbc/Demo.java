package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

public class Demo {
	public static void main(String[] args) {
		
		
//		System.out.println("programm started............");
//		//spring jdbc => JdbcTemplate
//		ApplicationContext context = new ClassPathXmlApplicationContext(
//				"com/spring/jdbc/config.xml");
//		JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
//		
//		//insert query
//		String query = "insert into student(id,name,city) values(?,?,?)";
//		
//		//fire query
//		int result = template.update(query,2,"Amit","Indore");
//		System.out.println("Number of record inserted.."+ result);
		
		
		
		//***************insert*****************

//		ApplicationContext context = new ClassPathXmlApplicationContext(
//				"com/spring/jdbc/config.xml");	
//	StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
	
//	Student student = new Student();
//	student.setId(3);
//	student.setName("Vinod");
//	student.setCity("Indore");
	
//	int result = studentDao.insert(student);
//	System.out.println("Student added " + result);
	

	//**********************update**************
	
//		ApplicationContext context = new ClassPathXmlApplicationContext(
//				"com/spring/jdbc/config.xml");	
//	StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
//	Student student = new Student();
//	student.setId(3);
//	student.setName("Abhay");
//	student.setCity("M.P.");
//	int result = studentDao.update(student);
//	System.out.println("Student updated " + result);
		
		
		//***************delete************
//		
//		ApplicationContext context = new ClassPathXmlApplicationContext(
//				"com/spring/jdbc/config.xml");	
//	StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
//	Student student = new Student();
//	int result = studentDao.delete(3);
//	System.out.println("Student deleted " + result);

	
	//***************select single data************
	
//			ApplicationContext context = new ClassPathXmlApplicationContext(
//					"com/spring/jdbc/config.xml");	
//		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
//		Student student = new Student();
//		student = studentDao.getStudent(1);
//		
//		System.out.println(student);
//		System.out.println(student.getId());
//		System.out.println(student.getName());
//		System.out.println(student.getCity());
//		
//		
//		//***************Select all data****************
//		ApplicationContext context = new ClassPathXmlApplicationContext(
//				"com/spring/jdbc/config.xml");
//		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
//		List<Student> student = studentDao.getAllStudent();
//		
//		for(Student s : student) {
//			System.out.println(s);
//		}
//		
//	}
		

		//***************Select all data****************
		ApplicationContext context = new AnnotationConfigApplicationContext(
				JdbcConfig.class);
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
		List<Student> student = studentDao.getAllStudent();
		
		for(Student s : student) {
			System.out.println(s);
		}
		
	}
}
