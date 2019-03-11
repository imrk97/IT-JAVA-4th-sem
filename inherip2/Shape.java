package com.inherip2;

public class Shape {
	private String color;
	private boolean filled;

	public Shape() {
		color = "green";
		filled = true;
	}

	public Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}


	public boolean isFilled() {
		return this.filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public String toString() {
		String s="A Shape with color of "+color+" and ";
		if(filled) {
			return s+"filled";
		}
		else {
			return s+"not filled";
		}
	}

}
