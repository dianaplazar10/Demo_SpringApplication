package com.springApp.dao;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/*
 * By implementing ApplicationContextAware, the Bean has access 
 * to the one and only Applicationcontect used for the applications Context, in the main class. DrawingApp in this case.
 */

public class Triangle_AutowiringDemo implements ApplicationContextAware{
	
	private Point pointZero;
	private Point pointB;
	private Point pointC;
	private ApplicationContext appContext;
	
	
	public void draw_autowiringDemo() {		
		System.out.println("ApplicationContext implementation is used to access or initiate other beans in the spring container");
		System.out.println("--------Example below to access Application name using App context---------------------------------------");
		System.out.println("appContext.getBean('..') : "+appContext.getBean("triangle_autowiringDemo"));
		System.out.println("appContext.getBean('..') : "+appContext.getBean("pointB"));
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
}
