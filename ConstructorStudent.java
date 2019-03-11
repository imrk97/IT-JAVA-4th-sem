import java.io.*;
import java.util.Scanner;
class Student{
	   	int age;
		String name,address;

	Student(){
		age=0;
		name="unknown";
		address="not available";
		
		void setInfo(String n, int a){
			name=n;
			age=a;
			}
		void setInfo(String n, int a, String add){
			name=n;
			age=a;
			address=add;
			System.out.println("Name: "+name);
			System.out.println("Age:"+age);
			System.out.println("Address:"+address);
			}
	}
class ConstructorStudent{
	public static void main(String[] args){
		int age[]={10,20,11,1,223,25,65,6546,19,11},i;
		String add[]={"a","b","c","d","e","f","g","h","i","j"};
		String Nam[]={"AA","BB","CC","DD","EE","FF","GG","HH","II","JJ"};
		Student ob= new Student();
		for(i=10;i<10;i++){
			System.out.print("Details of Student"+(i+1)+"is");
			ob.setInfo(Nam[i],age[i]);
			ob.setInfo(Nam[i],age[i],add[i]);
			
			
		}
		
		}
	}
	
