package in.com.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.com.spring.beans.Student;

public class SpringMain {

	public static void main(String[] args) {
		String config_loc = "in/com/spring/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);
		
		Student student1 = (Student)context.getBean("stdId");
		
		student1.display();
		
		
		
		//java 11 supports spring version 5.x
		//Spring-beans-xxx.jar
		//Spring-core-xxx.jar 
		//Spring-context-xxx.jar
		//Spring-expression-xxx.jar
		//Commons-logging-xxx.jar

	}

}
