package com.rohan_interface_animal;

public abstract class Animal {
	protected int legs;
	protected Animal(){
		
	}
	abstract void eat();
	void walk(int legs) {
		System.out.println("The Animal walks with "+legs+" legs");
	}
}