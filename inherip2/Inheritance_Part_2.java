package com.inherip2;

public class Inheritance_Part_2 {
	public static void main(String[] args) {
		Rectangle rt= new Rectangle();
		System.out.println(rt.toString(10.0,20.0)+" with Area: "+rt.getArea(10.0, 20.0)+" & Perimeter: "+rt.getPerimeter(10.0, 20.0));
		Circle cr=new Circle();
		System.out.println(cr.toString(10.0)+" with Area: "+cr.getArea(10.0)+" & Perimeter: "+cr.getPerimeter(10.0));
		Square sq=new Square();
		System.out.println(sq.toString(10.0)+" with Area: "+sq.getArea(10.0)+" & Perimeter: "+sq.getPerimeter(10.0));
		
	}
}
