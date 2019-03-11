package com.rohan;

import java.util.Scanner;

public class StaticMainClass {

	public static void main(String[] args) {
		Student[] students = new Student[5] ;
		Student s;
		Scanner sc = new Scanner(System.in);
		int[] marks1 = { 80,65,63,45,86};
		int[] marks2 = { 90,65,93,45,86};
		int[] marks3 = { 70,65,83,45,86};
		int[] marks4 = { 63,65,83,45,86};
		int[] marks5 = { 98,65,73,45,86};
		int[] totalMarks;
		for(int i=0;i<5;i++)
		{
			System.out.println("enter student name:");
			s = new Student(sc.next());
			s.setMarks1(marks1[i]);
			s.setMarks2(marks2[i]);
			s.setMarks3(marks3[i]);
			s.setMarks4(marks4[i]);
			s.setMarks5(marks5[i]);
			students[i]=s;
		}
		
		int max = students[0].sumOfMarks();
		int now;
		
		for(int i=0;i<5;i++)
		{
			now = students[i].sumOfMarks();
			if(now>max)
			{
				max=now;
			}
		}
	}

}
