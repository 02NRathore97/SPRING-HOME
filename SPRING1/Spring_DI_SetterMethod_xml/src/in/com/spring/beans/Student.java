package in.com.spring.beans;

public class Student {
	private String name;
	private String rollNo;
	private String email;
	private Address address;

	public void setName(String name) {
		System.out.println("setter method --- name");
		this.name = name;
	}

	public void setRollNo(String rollNo) {
		System.out.println("setter method --- rollno");
		this.rollNo = rollNo;
	}

	public void setEmail(String email) {
		System.out.println("setter method --- email");
		this.email = email;
	}

	public void setAddress(Address address) {
		System.out.println("setter method --- address");
		this.address = address;
	}

	public void display() {
		System.out.println("Name = " + name);
		System.out.println("RollNo = " + rollNo);
		System.out.println("Email = " + email);
		System.out.println("Address = " + address);
	}
}
