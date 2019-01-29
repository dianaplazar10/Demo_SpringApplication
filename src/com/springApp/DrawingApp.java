package com.springApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springApp.dao.Triangle;
import com.springApp.dao.Triangle_AutowiringDemo;

public class DrawingApp {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("beanfactory_autowiring.xml");    
		Triangle_AutowiringDemo tringlebean= (Triangle_AutowiringDemo) context.getBean("triangle_autowiringDemo");
	    tringlebean.draw_autowiringDemo();

	}

}

/*
 * output:
 * ------
 * 
ApplicationContext implementation is used to access or initiate other beans in the spring container
--------Example below to access Application name using App context---------------------------------------
appContext.getBean('..') : com.springApp.dao.Triangle_AutowiringDemo@3b084709
appContext.getBean('..') : com.springApp.dao.Point@3224f60b

BeanNameAware implementation is used to retrieve names of beans in the spring container
--------Example below to access the current Bean's name---------------------------------------
CurrentBeanName : triangle_autowiringDemo
 * 
 */
