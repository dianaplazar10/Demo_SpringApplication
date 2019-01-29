package com.springApp.dao;

import java.util.List;

public class Triangle{
	private String type;
	private int length;
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	private List<Point> pointsList;
	
	public List<Point> getPointsList() {
		return pointsList;
	}
	public void setPointsList(List<Point> pointsList) {
		this.pointsList = pointsList;
	}
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

	public void draw() {
		System.out.println("Dependency Injection via Inheritance config.");
		System.out.println("PointA: (" + getPointA().getX() + "," + getPointA().getY()+")");
		System.out.println("-----------------------------------------------");
		
		System.out.println("Dependency Injection via 'ref' attribute");
		System.out.println("PointB: (" + getPointB().getX() + "," + getPointB().getY()+")");
		System.out.println("-----------------------------------------------");
		
		System.out.println("Dependency Injection via inner bean implementation");
		System.out.println("PointC: (" + getPointC().getX() + "," + getPointC().getY()+")");
		System.out.println("-----------------------------------------------");
		
		System.out.println("Dependency Injection of Collection(List of Points) : adding 2 points to list");		
		getPointsList().forEach(p -> System.out.println("point.getX(): point.getY():::(" + p.getX() + "," + p.getY()+")"));
		System.out.println("-----------------------------------------------");
		
		
		System.out.println("Draw from Triangle class");
		System.out.println("Triangle with type:(initialized from spring container) " + getType());// + ";length : " +getLength());
		
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
