package in.com.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.com.spring.beans.Student;
import in.com.spring.resources.SpringConfigFile;

public class Springmain {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		
		Student student = (Student)context.getBean("stdId");
		student.display();

	}

}
