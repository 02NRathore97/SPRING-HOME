package com.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.aop.service.PaymentServiceImpl;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/aop/applicationContext.xml");

		PaymentServiceImpl paymentServiceImpl = context.getBean("paymentService", PaymentServiceImpl.class);
		
		paymentServiceImpl.makePayment();
	}
}
