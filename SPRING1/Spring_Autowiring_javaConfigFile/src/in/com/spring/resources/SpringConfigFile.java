package in.com.spring.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.com.spring.beans.Address;
import in.com.spring.beans.Student;

@Configuration
public class SpringConfigFile {
	@Bean
	public Address addrId() {
		Address address = new Address();
		address.setHouseNo(123);
		address.setCity("Indore");
		address.setState("MP");
		return address;

	}
	
	

	@Bean
	public Student stdId() {
		Student student = new Student();
		student.setName("Neeraj");
		student.setRollNo("101");
		student.setEmail("rathore@gmail.com");
		//student.setAddress(addrId());
		return student;
	}
}
