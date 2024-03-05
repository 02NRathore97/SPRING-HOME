package in.com.spring.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.com.spring.beans.Address;
import in.com.spring.beans.Student;

@Configuration
public class SpringConfigFile {
	@Bean
	public Address addrId() {
		Address address = new Address(123,"Indore","MP");
		return address;

	}
	
	

	@Bean
	public Student stdId() {
		Student student = new Student("Neeraj","101","rathore@gmail.com");
		return student;
	}
}
