package com.spring.orm;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

public class Demo {
	public static void main(String[] args) {
		System.out.println("Hello world");

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

		// insert
//	Student student = new Student(1,"Neeraj Rathore","Indore");
//	Student student = new Student(2,"Amit Rathore","Indore");
//	int result = studentDao.insert(student);
//	System.out.println("done" + result);

		// read single object
//	Student student = studentDao.getStudent(1);
//	System.out.println(student.getStudentId());
//	System.out.println(student.getStudentName());
//	System.out.println(student.getStudentCity());
//	}

		// read multiple object
//		List<Student> student = studentDao.getAllStudent();
//		for(Student s : student) {
//			System.out.println(s.getStudentId());
//			System.out.println(s.getStudentName());
//			System.out.println(s.getStudentCity());
//		}

		// update
//		Student student = new Student(1,"Vinod","Indore");
//		studentDao.updateStudent(student);
//		System.out.println("update successfully");
//		}

		// delete
//	Student student = new Student();
//	studentDao.deleteStudent(2);
//	System.out.println("deleted Successfully");
	}
}
