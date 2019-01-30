package com.springApp.dao;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Circle {

	private Point centre;
	private Point defaultCentre;

	public Point getCentre() {
		return centre;
	}

	@Autowired
	@Qualifier("circleCentrePoint")
	public void setCentre(Point centre) {
		this.centre = centre;
	}
	
	public Point getdefaultCentre() {
		return defaultCentre;
	}
	
	@Resource(name="point10")
	public void setdefaultCentre(Point defaultCentre) {
		this.defaultCentre = defaultCentre;
	}

	public void draw() {
		System.out.println("Centre: (" + getCentre().getX() + "," + getCentre().getY()+")");
		System.out.println("-----------------------------------------------");
		System.out.println();
		System.out.println("DefaultCentre: (" + getdefaultCentre().getX() + "," + getdefaultCentre().getY()+")");
		System.out.println("-----------------------------------------------");
	}
	
	/*
	 * @PostConstruct performs teh same way as implementing Initialisingbean interface 
	 * 
	 * @PreDestroy will be effective only with teh registry of shutdownhook to teh appContext in the main class.
	 */
	@PostConstruct
	public void beforeInitialise(){
		System.out.println("print from beforeInitialise() of Circle");
	}
	
	@PreDestroy
	public void beforeDestroy(){
		System.out.println("print from beforeDestroy() of Circle");
	}

}
