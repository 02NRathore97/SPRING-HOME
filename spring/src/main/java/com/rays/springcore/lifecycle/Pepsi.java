package com.rays.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean,DisposableBean{
	private double price;
	
	public Pepsi() {
		// TODO Auto-generated constructor stub
	}
	
	
	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		System.out.println(("setting properties"));
		this.price = price;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Pepsi [price = " +price+" ]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside Init Mehtod");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Insinde destory method");
		// TODO Auto-generated method stub
		
	}
}
