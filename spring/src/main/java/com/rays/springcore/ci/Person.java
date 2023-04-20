package com.rays.springcore.ci;

import java.util.List;

public class Person {
	//attributes
	private String name;
	private int personId;
	private Certi certi;
	private List<String> list;
	
	
	//parameterized constructor
	public Person(String name, int personId, Certi certi, List<String> list) {
			this.name=name;
			this.personId= personId;
			this.certi=certi;
			this.list=list;

	}
	
	//toString method
	public String toString() {
		return this.name +" : "+this.personId +" : "+this.certi+" : "+this.list;
	}
}
