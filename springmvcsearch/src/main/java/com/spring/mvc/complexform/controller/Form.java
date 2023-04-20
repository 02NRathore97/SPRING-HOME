package com.spring.mvc.complexform.controller;

import java.util.Date;
import java.util.List;

public class Form {
	private String email;
	private Long password;
	private String checkbox;
	private Date date;
	private String gender;
	private List<String> select;
	private Address address;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPassword() {
		return password;
	}
	public void setPassword(Long password) {
		this.password = password;
	}
	public String getCheckbox() {
		return checkbox;
	}
	public void setCheckbox(String checkbox) {
		this.checkbox = checkbox;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public List<String> getSelect() {
		return select;
	}
	public void setSelect(List<String> select) {
		this.select = select;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Form [email=" + email + ", password=" + password + ", checkbox=" + checkbox + ", date=" + date
				+ ", gender=" + gender + ", select=" + select + ", address=" + address + "]";
	}
	


}
