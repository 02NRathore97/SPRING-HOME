package in.com.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.com.spring.beans.Student;

public class SpringMain {

	public static void main(String[] args) {
		String config_loc = "in/com/spring/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);
		
		Student student = (Student)context.getBean("student");
		student.display();
	}

}
