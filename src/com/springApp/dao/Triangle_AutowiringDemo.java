package com.springApp.dao;

public class Triangle_AutowiringDemo{
	
	private Point pointZero;
	private Point pointB;
	private Point pointC;
	
	
	public void draw_autowiringDemo() {		
		System.out.println("pointZero: (" + getPointZero().getX() + "," + getPointZero().getY()+")");
		System.out.println("-----------------------------------------------");
		
		System.out.println("pointB: (" + getPointB().getX() + "," + getPointB().getY()+")");
		System.out.println("-----------------------------------------------");
		
		System.out.println("pointC: (" + getPointC().getX() + "," + getPointC().getY()+")");
		System.out.println("-----------------------------------------------");
		
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
}
