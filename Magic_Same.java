import java.util.Scanner;
class Magic_Same{
	static String str;
	public static void main(String [] args){
		System.out.println("Enter your name: ");
		Scanner sc= new Scanner(System.in);
		str=sc.next();
		System.out.println("\n\n");
		for(int i=0;i<str.length();i++){
			System.out.println("\n"+str.substring(i));
			}
		}
	}