package com.inherip2;

public class Rectangle extends Shape {
	private double width,length;
	
	public Rectangle() {
		width=1.0;
		length=1.0;
	}
	public double getWidth() {
		return this.width;
	}
	public void setWidth(double width) {
		this.width=width;
	}
	public double getLength() {
		return this.length;
	}
	public void setLength(double length) {
		this.length=length;
	}
	public double getArea(double width,double length) {
		return width*length;
	}
	public double getPerimeter(double width, double length) {
		return 2*(width+length);
	}
	public String toString(double width,double length) {
		return "A Rectangle with width="+width+" and length="+length+", which is sub-class of "+super.toString();		
	}
}
