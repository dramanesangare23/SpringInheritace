package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args){

		//Definition of the context
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
		
		//Definition of objects
		HelloWorld helloWorld = (HelloWorld)applicationContext.getBean("helloWorld");
		helloWorld.getMessage1();
		helloWorld.getMessage2();
		System.out.println("=============== End of the helloWorld object ===============\n");
		
		HelloMali helloMali = (HelloMali)applicationContext.getBean("helloMali");
		helloMali.getMessage1();
		helloMali.getMessage2();
		helloMali.getMessage3();
		
		((AbstractApplicationContext)applicationContext).close();
	}
}
