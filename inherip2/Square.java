package com.inherip2;

public class Square extends Rectangle {
	private double side;
	public double getSide() {
		return this.side;
	}
	public void setSide(double side) {
		this.side=side;
	}
	public Square() {
		side=1.0;
	}
	
	public String toString() {
		return "A square with side "+side+", which is a sub-class of "+super.toString();
	}
	public double getArea(double side) {
		return side*side;
	}
	public double getPerimeter(double side) {
		return 2*side;
	}
	public String toString(double side) {
		return "A Square with side "+side+", which is sub-class of "+super.toString();		
	}
	/*public double getWidth() {
		return side;
	}
	public void setWidth(double width) {
		side=width;
	}
	public double getLength() {
		return side;
	}
	public void setLength(double length) {
		side=length;
	}*/

}
