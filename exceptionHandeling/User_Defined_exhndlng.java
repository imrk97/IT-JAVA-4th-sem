package com.rohan;

import java.util.Scanner;


	public class User_Defined_exhndlng {
		public static int [] arr= {3,0};
		 public static void main(String [] args){
		        
				@SuppressWarnings("resource")
				Scanner nation= new Scanner(System.in);
		        System.out.print("Enter the name of an country:");
		        String country= nation.next();
		        try{
		        if(country.equals("India")){
		            System.out.println("It is okay");
		            
		        }
		        else{
		            throw(new NoMatchException());
		            }
		            
		    }
		    catch(NoMatchException e){
		        System.out.println(e.getMessage());
		        }
		        Divide d=new Divide( arr[0], arr[1]);
		        System.out.println(d);
		    }
		}



