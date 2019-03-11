import java.io.*;
class Static_Block{
	static int num;
	static String str;
	static{
		num=97;
		str=" Static in java";
		}
	
	static{
		System.out.println("this is a static block");
		
		}
		
		public static void main(String [] args){
			System.out.println("Value of num:"+num);
			System.out.println("Value of str:"+str);
			}
		}
		
		
