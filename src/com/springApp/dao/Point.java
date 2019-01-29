package com.springApp.dao;
public class Point {
 private int x;
 private int y;
 public int getX() {
  return x;
 }
 //Set methods can be commented  only if the setting of these values are handled by constructors, else setters are required.
 //if configured values for variables x n y using constructors and constructor tag in spring.xml using <property> tags, 
 //then setter methods here can be commented
 
 public void setX(int x) {
  this.x = x;
 }
 public int getY() {
  return y;
 }
 public void setY(int y) {
  this.y = y;
 }

public Point() {
	// TODO Auto-generated constructor stub
}
}