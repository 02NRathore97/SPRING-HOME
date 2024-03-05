package in.com.spring.beans;

public class Student {
	private String name;
	private String rollNo;
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
		System.out.println("Name = "+ name);
		System.out.println("RollNo = "+ rollNo);
		System.out.println("Email = "+ email);
	}
}
