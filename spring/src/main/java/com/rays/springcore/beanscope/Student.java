package com.rays.springcore.beanscope;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("stu")
@Scope("prototype")
public class Student {
	//attribute
	@Value("Neeraj")
	private String studentName;
	
	
	//getter setter
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	//toString method
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + "]";
	}
	
	
}
