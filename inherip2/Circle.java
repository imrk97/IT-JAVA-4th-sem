package com.inherip2;

public class Circle extends Shape {
	private double radius;
	public Circle() {
		radius=1.0;
	}
	public double getRadius() {
		return this.radius;
	}

	public void setRadius(double radius){
		this.radius = radius;
	}
	public double getArea(double radius) {
		return 3.14*radius*radius;
		}
	public double getPerimeter(double radius) {
		return 3.14*2*radius;
	}
	public String toString(double radius) {
		return "A Circle with radius= "+radius+", which is a subclass of "+super.toString();		
	}
}
