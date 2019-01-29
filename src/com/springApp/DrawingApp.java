package com.springApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springApp.dao.Triangle;

public class DrawingApp {

	public static void main(String[] args) {
		//BeanFactory factory = new XmlBeanFactory(resource)
		 ApplicationContext context= new ClassPathXmlApplicationContext("beanfactory.xml");
	        Triangle tringlebean= (Triangle) context.getBean("triangle");
	        tringlebean.draw();

	}

}
