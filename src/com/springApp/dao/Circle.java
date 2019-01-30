package com.springApp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Circle {

	private Point centre;

	public Point getCentre() {
		return centre;
	}

	@Autowired
	@Qualifier("circleCentrePoint")
	public void setCentre(Point centre) {
		this.centre = centre;
	}

	public void draw() {
		System.out.println("Centre: (" + getCentre().getX() + "," + getCentre().getY()+")");
		System.out.println("-----------------------------------------------");
		
		
	}

}
