package com.rohan_interface_animal;

public class TestAminals {
	public static void main(String [] args) {
		Fish f=new Fish();
		Cat c=new Cat("Fluffy");
		Animal a=new Fish();
		Animal s=new Spider();
		Pet pcat=new Cat();
		Pet pfish=new Fish();
		a.walk(4);
		s.eat();
		pcat.setName("Fluffy");
		System.out.println("The name of my pet cat is "+pcat.getName());
		c.eat();
		f.eat();
		pfish.setName("Parrot");
		System.out.println("Fish name is "+pfish.getName());
		c.play();
		f.play();
		
	}
	
}
