package com.rohan;


	public class Divide {
		
		Divide(int a, int b){
			 try {
				int i= a/b;
				i=i/i;
			 	}
			 catch(ArithmeticException ex){
				 System.out.println(ex.getMessage());
			 }
		}

	}



