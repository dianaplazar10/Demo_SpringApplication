package com.springApp.dao;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/*
 * By implementing ApplicationContextAware, the Bean has access 
 * to the one and only Applicationcontect used for the applications Context, in the main class. DrawingApp in this case.
 */

public class Triangle_AutowiringDemo implements ApplicationContextAware,BeanNameAware{
	
	private Point pointZero;
	private Point pointB;
	private Point pointC;
	private ApplicationContext appContext;
	private String beanName;
	
	
	public void draw_autowiringDemo() {		
		System.out.println("ApplicationContext implementation is used to access or initiate other beans in the spring container");
		System.out.println("--------Example below to access Application name using App context---------------------------------------");
		System.out.println("appContext.getBean('..') : "+appContext.getBean("triangle_autowiringDemo"));
		System.out.println("appContext.getBean('..') : "+appContext.getBean("pointB"));
		
		System.out.println();
		System.out.println("BeanNameAware implementation is used to retrieve names of beans in the spring container");
		System.out.println("--------Example below to access the current Bean's name---------------------------------------");
		System.out.println("CurrentBeanName : "+beanName);
	}

	public Point getPointZero() {
		return pointZero;
	}

	public void setPointZero(Point pointZero) {
		this.pointZero = pointZero;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	//mandatory to create default constructor, else results in org.springframework.beans.factory.BeanCreationException
	public Triangle_AutowiringDemo() {
	}

	@Override
	public void setApplicationContext(ApplicationContext appContext) throws BeansException {
		this.appContext = appContext;
		
	}

	@Override
	public void setBeanName(String beanName) {
		this.beanName = beanName;
		
	}
}
