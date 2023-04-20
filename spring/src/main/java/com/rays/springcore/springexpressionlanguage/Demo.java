package com.rays.springcore.springexpressionlanguage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	//attribute
	@Value("#{22+2}")	//expression language
	private int x;
	@Value("#{8>6?10:20}")
	private int y;
	
	@Value("#{T(java.lang.Math).sqrt(122)}")	//static method
	private double z;
	
	@Value("#{T(java.lang.Math).E}")	//static Variable
	private double e;
	
	@Value("#{new java.lang.String('Neeraj')}")
	private String name;
	
	@Value("#{8>3}")
	private boolean isActive;
	
	//getter setter
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	public double getE() {
		return e;
	}
	public void setE(double e) {
		this.e = e;
	}
	//toString method
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", name=" + name + ", isActive=" + isActive
				+ "]";
	}
	
	
	
	
	
}
