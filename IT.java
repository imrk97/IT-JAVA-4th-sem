package Department;
import University.*;
class Dept_Details extends Details{
	
	public void newDetails(int Roll_No,String Dept){
		System.out.println("College Roll No: "+Roll_No);
		System.out.println("Department: "+Dept);
	}
}
class IT_2ndyear{
	public IT_2ndyear(int stuno){
		System.out.println("The  Total number of students in IT 2nd year is "+stuno);
	}
}
public class IT{
	public static void main(){
		Dept_Details ob1= new Dept_Details();
		ob1.newDetails(25,"IT");
		IT_2ndyear ob2=new IT_2ndyear(63);
	}

}
