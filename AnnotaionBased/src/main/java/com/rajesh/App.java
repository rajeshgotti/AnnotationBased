package com.rajesh;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.rajesh")

public class App {
	public static void main(String[] args) {

		ApplicationContext ct = new AnnotationConfigApplicationContext(App.class);
		PersonBean p = (PersonBean) ct.getBean(PersonBean.class);
		CustomerBean c = (CustomerBean) ct.getBean(CustomerBean.class);
		p.print();
		c.print2();
}}
