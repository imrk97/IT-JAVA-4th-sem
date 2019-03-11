import java.io.*;
import java.util.Scanner;
public class IfElse{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the integer to check if it's a positive or a negative number:");
		int a=sc.nextInt();
		
		if(a<0){
			System.out.println("the value is a negative number!");
				}
		else{
			System.out.println("the value is a positive number!");
			}
		}
	}
