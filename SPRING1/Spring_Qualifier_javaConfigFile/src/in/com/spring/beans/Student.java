package in.com.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	private String name;
	private String rollNo;
	private String email;
	
	
	
	//Autowiring can be done only for non-primitive data type
	@Autowired
	@Qualifier("addrId1")
	private Address address;

	public void setName(String name) {
		this.name = name;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void display() {
		System.out.println("Name = " + name);
		System.out.println("RollNo = " + rollNo);
		System.out.println("Email = " + email);
		System.out.println("Address = " + address);
	}
}
