package com.springtest.dao;

public class Circle implements Shape{

	private int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("SHAPE = circle with radius : " + radius);		
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	//mandatory to create default constructor, else results in org.springframework.beans.factory.BeanCreationException
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	
}
