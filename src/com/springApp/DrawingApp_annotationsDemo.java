package com.springApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springApp.dao.Circle;

public class DrawingApp_annotationsDemo {

	public static void main(String[] args) {	    
		//BeanFactory factory = new XmlBeanFactory(resource)
		 ApplicationContext context= new ClassPathXmlApplicationContext("beanfactory_annotations.xml");
		 Circle circle= (Circle) context.getBean("circle");
	     circle.draw();
	}

}

/*
 * output:
 * ------
 * 
 * 
 */
