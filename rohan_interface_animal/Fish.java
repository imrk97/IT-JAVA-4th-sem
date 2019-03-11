package com.rohan_interface_animal;

public class Fish extends Animal implements Pet {
	private String fish_name;
	void walk(int legs) {
		System.out.println("Fish can't walk");
	}
	public void eat() {
		System.out.println("Fish eats algea!! Aquarium Fish eats Dry food");
	}
	public void play() {
		System.out.println("Fish play with themselves and with objects in water");
	}
	public void setName(String fish_name) {
		this.fish_name=fish_name;
	}
	public String getName() {
		return this.fish_name;
	}
	
	
	Fish(String fish_name){
		
	}
	Fish(){
		this("");
	}
	
}
