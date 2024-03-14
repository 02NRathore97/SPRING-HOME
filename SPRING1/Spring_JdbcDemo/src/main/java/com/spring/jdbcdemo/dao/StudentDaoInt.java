package com.spring.jdbcdemo.dao;

import java.util.List;

import com.spring.jdbcdemo.dto.Student;

public interface StudentDaoInt {
	
	public int insert(Student student);
	
	public int update(Student student);
	
	public Student getStudent(int studentId);
	
	public List<Student> getStudents();
}
