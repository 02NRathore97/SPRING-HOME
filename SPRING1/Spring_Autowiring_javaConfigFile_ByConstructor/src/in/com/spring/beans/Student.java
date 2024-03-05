package in.com.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	private String name;
	private String rollNo;
	private String email;
	@Autowired
	private Address address;

	public Student(String name, String rollNo, String email) {

		this.name = name;
		this.rollNo = rollNo;
		this.email = email;

	}

	public void display() {
		System.out.println("Name = " + name);
		System.out.println("RollNo = " + rollNo);
		System.out.println("Email = " + email);
		System.out.println("Address = " + address);
	}
}
