package in.com.spring.beans;

public class Student {
	private String name;
	private String rollNo;
	private String email;
	private Address address;

	public Student(String name, String rollNo, String email, Address address) {

		this.name = name;
		this.rollNo = rollNo;
		this.email = email;
		this.address = address;
	}

	public void display() {
		System.out.println("Name = " + name);
		System.out.println("RollNo = " + rollNo);
		System.out.println("Email = " + email);
		System.out.println("Address = " + address);
	}
}
