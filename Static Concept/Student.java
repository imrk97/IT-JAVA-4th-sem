package com.rohan;

public class Student {
	private static String name; 
	private static int marks1;
	private static int marks2;
	private static int marks3;
	private static int marks4;
	private static int marks5;
	
	public Student(String name) {
		this.name = name;
	}
		
	public static int getMarks1() {
		return marks1;
	}

	public static void setMarks1(int marks1) {
		Student.marks1 = marks1;
	}

	public static int getMarks2() {
		return marks2;
	}

	public static void setMarks2(int marks2) {
		Student.marks2 = marks2;
	}

	public static int getMarks3() {
		return marks3;
	}

	public static void setMarks3(int marks3) {
		Student.marks3 = marks3;
	}

	public static int getMarks4() {
		return marks4;
	}

	public static void setMarks4(int marks4) {
		Student.marks4 = marks4;
	}

	public static int getMarks5() {
		return marks5;
	}

	public static void setMarks5(int marks5) {
		Student.marks5 = marks5;
	}

	public static int sumOfMarks()
	{
		return marks1+marks2+marks3+marks4+marks5;
	}
	
	
	
}
