package com.rohan_interface_animal;

public class Cat extends Animal implements Pet {
	private String pet_name;
	Cat(String pet_name){
		super.walk(4);
	}
	Cat(){
		this("");
	}
	public String getName() {
		return this.pet_name;
	}
	public void setName(String pet_name) {
		this.pet_name=pet_name;
		}
	public void eat() {
		System.out.println("cat eats Fish!!");
	}
	public void play() {
		System.out.println("cat play with a toy mouse");
	}
	

}
