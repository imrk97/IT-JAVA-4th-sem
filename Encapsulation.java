class Rectangle
{
	private int length;
	private int breath;
	
	public void setLength(int l)
	{
		length=l;
	}
	public int getLength()
	{
		return length;
	}
	
	public void setBreath(int b)
	{
		breath=b;
	}
	public int getBreath()
	{
		return breath;
	}
	
	public int area(){
		return length*breath;
	}
	
	public int area(int l,int b){
		return l*b;
	}
	
}


public class Encapsulation{

	public static void main(String []args)
	{
		Rectangle rec =new Rectangle();
		rec.setLength(5);
		rec.setBreath(2);
		System.out.println("area of rectangle rec:::::" + rec.area());
		System.out.println("rectangle rec:::::" + rec.getLength() +"::::::::" + rec.getBreath());
		Rectangle rect =new Rectangle();
		System.out.println("area of rectangle rect:::::" + rec.area(10,5));
	}
}
