package com.spring.jdbcdemo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbcdemo.dao.StudentDaoImpl;
import com.spring.jdbcdemo.dto.Student;

public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
      
//		JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);
//
//		String query = "insert into student( id, name, city ) values( ?,?,?)";
//
//		int i = jdbcTemplate.update(query, 103, "Vinod", "Indore");
//		System.out.println("Inserted " + i);
      
      
      
      StudentDaoImpl studentDao = context.getBean("studentDao",StudentDaoImpl.class);
      
//      Student student  = new Student();
//      student.setId(105);
//      student.setName("Abhay Rathore");
//      student.setCity("indore");
//      
//      int i = studentDao.insert(student);
//      System.out.println("Inserted..." + i);
      
      
//      Student student = new Student();
//      student.setId(105);
//      student.setName("Kanak");
//      student.setCity("Ujjain");
//      
//      int i = studentDao.update(student);
//      System.out.println("updated successfully.. "+i);
      
      
      //search an single object
       Student student = studentDao.getStudent(101);
      System.out.println(student);
     
      //search
      List<Student> students = studentDao.getStudents();
      for (Student student1 : students) {
    	  System.out.println(student1);
	}
     
    }
}
