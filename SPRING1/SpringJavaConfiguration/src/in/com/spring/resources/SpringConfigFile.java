package in.com.spring.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.com.spring.beans.Student;

@Configuration
public class SpringConfigFile {
	
//	@Bean
//	public Student stdId() {
//		Student student = new Student();
//		
//		student.setName("Neeraj");
//		student.setRollNo("101");
//		student.setEmail("rathore@gmail.com");
//		
//		return student;
//	}
	
	
	
	
	@Bean("stdObj")
	public Student stdId() {
		Student student = new Student();
		
		student.setName("Neeraj");
		student.setRollNo("101");
		student.setEmail("rathore@gmail.com");
		
		return student;
	}
	
}
