package com.springApp.dao;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle_demoCallBacks implements InitializingBean,DisposableBean{
	
	private Point pointA;
	
	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public void draw() {
		System.out.println("PointA: (" + getPointA().getX() + "," + getPointA().getY()+")");
		System.out.println("-----------------------------------------------");
		
	}

	//mandatory to create default constructor, else results in org.springframework.beans.factory.BeanCreationException
	public Triangle_demoCallBacks() {
	}

	//Method below is implementation for InitializingBean interface
	@Override
	public void afterPropertiesSet() throws Exception {
		//System.out.println("printing from : afterPropertiesSet() from Triangle_demoCallBacks.java");		
	}
	
	//Method below is implementation for DisposableBean interface
	@Override
	public void destroy() throws Exception {
		//System.out.println("printing from : destroy() from Triangle_demoCallBacks.java");
	}
}
