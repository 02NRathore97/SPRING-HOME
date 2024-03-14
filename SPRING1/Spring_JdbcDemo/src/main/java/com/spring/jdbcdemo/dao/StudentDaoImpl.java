package com.spring.jdbcdemo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbcdemo.dto.Student;

public class StudentDaoImpl implements StudentDaoInt {

	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	//Insert
	public int insert(Student student) {
		String query = "insert into Student(id, name, city) value(?,?,?)";
		int i = jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
		return i;
	}

	//update
	public int update(Student student) {
		String query = "update student set name = ?, city = ? where id = ?;";
		int i = jdbcTemplate.update(query, student.getName(), student.getCity(),student.getId());
		return i;
	}

	public Student getStudent(int studentId) {
		String query = "select * from student where id = ?";
		RowMapperImpl rowMapper = new RowMapperImpl();
		Student student = jdbcTemplate.queryForObject(query, rowMapper, studentId);
		return student;
	}

	public List<Student> getStudents() {
		String query = "select * from student";
		RowMapperImpl rowMapper = new RowMapperImpl();
		List<Student> list = jdbcTemplate.query(query, rowMapper);
		return list;
	}

}
