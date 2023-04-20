package com.spring.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.entities.Student;
@Component("studentDao")
public class StudentDaoImpl implements StudentDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	@Override
	public int insert(Student student) {
		//insert query
	String query = "insert into student(id,name,city) values(?,?,?)";
	int result = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());			
		return result;
	}
	@Override
	public int update(Student student) {
		//update query
		String query = "update student set name=?,city=? where id=?";
		int result = this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());			
			return result;
	}
	@Override
	public int delete(int studentId) {
		//delete query
		Student student = new Student();
		String query = "delete from student where id=?";
		int result = this.jdbcTemplate.update(query,studentId);
		return result;			
		
	}
	@Override
	public Student getStudent(int studentId) {
		//select single student data
		String query = "select * from student where id=?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student student = this.jdbcTemplate.queryForObject(query, rowMapper, studentId);
		
//		Student student = this.jdbcTemplate.queryForObject(query, new RowMapper<Student>() {
//			
//
//			@Override
//			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
//				Student student = new Student();
//				student.setId(rs.getInt(1));
//				student.setName(rs.getString(2));
//				student.setCity(rs.getString(3));
//				return student;
//			}
//			
//		}, studentId);
		return student;
	}
	@Override
	public List<Student> getAllStudent() {
		// select multiple data
		String query = "select * from student";
		List<Student> student= this.jdbcTemplate.query(query,new RowMapperImpl());
		
		return student;
	}

}
