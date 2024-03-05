package in.com.spring.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("Neeraj")
	private String name;
	@Value("101")
	private String rollNo;
	@Value("rathore@gmail.com")
	private String email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void display() {
		System.out.println("Name = "+name);
		System.out.println("RollNo = "+rollNo);
		System.out.println("Email = "+email);
	}

}
