import java.io.*;
import java.util.*;
public class area{
	public static void main( String args[])
	{
		rectangle rohan= new rectangle();
		rohan.rectarea(10,20);
		rohan.rectperi(10,20);
		circle rohan1= new circle();
		rohan1.circlearea(10);
		rohan1.circlecir(100);
		cube rohan2= new cube();
		rohan2.volume(20);
		cylinder rohan3= new cylinder();
		rohan3.volume(10,5);
	}
}
class circle
{
	void circlearea(double r)
	{
		double ar = 3.14*r*r;
		System.out.println("\n\n\nthe radius of the circle is== "+r);
		System.out.println("the formula to find the are of the circle is 3.14*r*r");
		System.out.println("the area of the circle is== "+ar);
	}
	
	void circlecir(double r)
	{
		double cir= 2*3.14*r;
		System.out.println("\nthe radius of the circle is== "+r);
		System.out.println("the formula to find the are of the circle is 2*3.14*r");
		System.out.println("the area of the circle is== "+cir);
	}
}
class cube
{
	void volume(double s)
	{
		double vol=s*s*s;
		System.out.println("\n\n\nthe length of the side of the cube  is== "+s);
			System.out.println("the formula to find the volume of a cube is s*s*s");
			System.out.println("the area of the cube is== "+vol);
	}
}
class cylinder
{
	void volume(double r,double h)
	{
		double vol=3.14*r*r*h;
		System.out.println("\n\n\nthe radius of the suface of the cylinder is=="+r);
			System.out.println("the height os the cylinder is== "+h);
			System.out.println("the formula to find the volume of a cylinder is 3.14*r*r*h");
			System.out.println("the area of the cylinder is== "+vol);
		}
	}
class rectangle
{
		int l,b;
		void rectarea(int l,int b)
		{
			int area=l*b;
			System.out.println("\n\n\nthe length is=="+l);
			System.out.println("the breadth is== "+b);
			System.out.println("the formula to find the area of a rectangle is l*b");
			System.out.println("the area of the rectangle is== "+area);
		}
		void rectperi(int l, int b)
		{
			int peri= 2*(l+b);
			System.out.println("\nthe length is=="+l);
			System.out.println("the breadth is== "+b);
			System.out.println("the formula to find the perimeter of a rectangle is 2*(l+b)");
			System.out.println("the perimeter of the rectangle is== "+peri);
}

}
