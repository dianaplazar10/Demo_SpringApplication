package com.springtest.dao;

public class Triangle implements Shape{
	private String type;
	private int length;
	
	private Point pointA;
	 private Point pointB;
	 private Point pointC;
	 
	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
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
	public Triangle(String type, int length) {
		this.type =type;
		this.length = length;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	@Override
	public void draw() {
		System.out.println("SHAPE = triangle with type: " + getType() + ";length : " +getLength());
		 System.out.println("PointA: (" + getPointA().getX() + "," + getPointA().getY()+")");
		  System.out.println("PointB: (" + getPointB().getX() + "," + getPointB().getY()+")");
		  System.out.println("PointC: (" + getPointC().getX() + "," + getPointC().getY()+")");
		
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	

	//mandatory to create default constructor, else results in org.springframework.beans.factory.BeanCreationException
	public Triangle() {
		// TODO Auto-generated constructor stub
	}
}
