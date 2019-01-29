package com.springApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springApp.dao.Triangle;
import com.springApp.dao.Triangle_AutowiringDemo;

public class DrawingApp {

	public static void main(String[] args) {
		//BeanFactory factory = new XmlBeanFactory(resource)
//		 ApplicationContext context= new ClassPathXmlApplicationContext("beanfactory.xml");
//		 Triangle tringlebean= (Triangle) context.getBean("triangle");
//	     tringlebean.draw();
		ApplicationContext context= new ClassPathXmlApplicationContext("beanfactory_autowiring.xml");    
		Triangle_AutowiringDemo tringlebean= (Triangle_AutowiringDemo) context.getBean("triangle_autowiringDemo");
	    tringlebean.draw_autowiringDemo();

	}

}

/*
 * output-for beanfactory.xml:
 * ------
 * Dependency Injection via Inheritance config.
PointA: (0,0)
-----------------------------------------------
Dependency Injection via 'ref' attribute
PointB: (1,1)
-----------------------------------------------
Dependency Injection via inner bean implementation
PointC: (2,2)
-----------------------------------------------
Dependency Injection of Collection(List of Points) : adding 2 points to list
point.getX(): point.getY():::(10,10)
point.getX(): point.getY():::(0,0)
point.getX(): point.getY():::(30,30)
-----------------------------------------------
Draw from Triangle class
Triangle with type:(initialized from spring container) equilateral
 * 
 */
