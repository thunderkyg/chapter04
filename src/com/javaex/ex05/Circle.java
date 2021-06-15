package com.javaex.ex05;

public class Circle {
	
	//Field
	private int radius;

	
	//Constructor
	public Circle() {
		super();
	}
	
	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	
	//Method - g/s
	
	public int getRadius() {
		return radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}

	//Method - Ordinary
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	

}