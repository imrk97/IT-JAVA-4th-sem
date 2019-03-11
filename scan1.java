import java.util.Scanner;
public class scan1{
	public static void main(String [] args){
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a Number");
		int user_input= scan.nextInt();
		System.out.print("The entered value is: ");
		System.out.print(user_input);
	}
}