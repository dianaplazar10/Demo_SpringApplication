package com.springApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springApp.dao.Triangle_demoCallBacks;

public class DrawingApp {

	public static void main(String[] args) {	    
		//BeanFactory factory = new XmlBeanFactory(resource)
//		 ApplicationContext context= new ClassPathXmlApplicationContext("beanfactory.xml");
//		 Triangle tringlebean= (Triangle) context.getBean("triangle");
//	     tringlebean.draw();
		
//		ApplicationContext context= new ClassPathXmlApplicationContext("beanfactory_autowiring.xml");    
//		Triangle_AutowiringDemo tringlebean= (Triangle_AutowiringDemo) context.getBean("triangle_autowiringDemo");
//	    tringlebean.draw_autowiringDemo();
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("beanfactory.xml");
		context.registerShutdownHook();
		/*registerShutdownHook() API is available only for AbstractAppContext. 
		*calling this api enables shutdown of all beans at the end of this main method
		*if the bean has implemented DisposableBean, then, the Destroy method of that bean will be called with this api call on the context
		**/
		
		Triangle_demoCallBacks tringlebean= (Triangle_demoCallBacks) context.getBean("triangle_demoCallBacks");
	    tringlebean.draw();
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



output after implementing AbstractApplicationContext and call to registerShutdownHook:
--------Output start--------------------
INFO: Loading XML bean definitions from class path resource [beanfactory.xml]
printing from : afterPropertiesSet() from Triangle_demoCallBacks.java
PointA: (1,1)
-----------------------------------------------
Jan 29, 2019 11:58:01 AM org.springframework.context.support.ClassPathXmlApplicationContext doClose
INFO: Closing org.springframework.context.support.ClassPathXmlApplicationContext@1a6c5a9e: startup date [Tue Jan 29 11:58:01 PST 2019]; root of context hierarchy
printing from : destroy() from Triangle_demoCallBacks.java
--------Output End--------------------
 * 
 */
