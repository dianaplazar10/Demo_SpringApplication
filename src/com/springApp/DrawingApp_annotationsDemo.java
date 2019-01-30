package com.springApp;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springApp.dao.Circle;

public class DrawingApp_annotationsDemo {

	public static void main(String[] args) {	    
		//BeanFactory factory = new XmlBeanFactory(resource)
//		 ApplicationContext context= new ClassPathXmlApplicationContext("beanfactory_annotations.xml");
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("beanfactory_annotations.xml");
		context.registerShutdownHook();
		Circle circle= (Circle) context.getBean("circle");
	    circle.draw();
	}

}

/*
 * output:
 * ------
 * 
INFO: Loading XML bean definitions from class path resource [beanfactory_annotations.xml]
print from beforeInitialise() of Circle
Centre: (1,1)
-----------------------------------------------

DefaultCentre: (10,10)
-----------------------------------------------
Jan 29, 2019 5:18:56 PM org.springframework.context.support.ClassPathXmlApplicationContext doClose
INFO: Closing org.springframework.context.support.ClassPathXmlApplicationContext@1a6c5a9e: startup date [Tue Jan 29 17:18:56 PST 2019]; root of context hierarchy
print from beforeDestroy() of Circle
 * 
 * 
 */
