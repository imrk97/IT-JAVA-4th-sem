import java.io.*;

class rohank{
	public static void main(String args[]){
		areacon A1= new areacon(10,20);
		areacon A2= new areacon(10);
		volumecon V1= new volumecon(10);
		volumecon V2=new volumecon(10,5);
		System.out.println(V1);
		System.out.println(A1);
	}
	static{
		System.out.println("this is static inside the main class!!");
	}
}
class areacon
{
	public areacon(int length, int breadth)
	{
		int ar=length*breadth;
		int per=2*(length+breadth);
		System.out.println("the length of the side of the rectangle is"+length);
		System.out.println("the breadth of the rectangle is "+breadth);
		System.out.println("area of the rectangle is "+ar);
		System.out.println("the perimeter of the rectangle is "+per);
	}
	public areacon(double rad)
	{
		System.out.println("\n the radius of the circle is "+rad);
		double ar= 3.14*rad*rad;
		System.out.println("area of the circle is "+ar);
		double per= 2*3.14*rad;
		System.out.println("the perimeter of a circle is "+per);
	}
	public String toString()
	{
		return("areacon Class ");
	}
}
class volumecon{
	public volumecon(int side){
		int vol=side*side*side;
		System.out.println("the length of a side of the cube is "+side);
		System.out.println("the volume os the cube is "+vol);
	}
	public volumecon(double rad,double height){
		double vol= 3.14*rad*rad*height;
		System.out.println("the radius of the surface of the cylinder is "+rad);
		System.out.println("the height of the cylinder is "+height);
		System.out.println("the volume of the cylinder is "+vol);
	}

		static{
			System.out.println("this is static");
			
		}
	
}
