import java.util.Scanner;
class interest
	{		
			void interest(int t,int p)
	{
		double i=(p*t*8)/100;
		System.out.println("the interest is "+i);
		
	}
	}	
	
class SBI extends interest{
    
	void interest(int t,int p)
	{
		double i=(p*t*8)/100;
		System.out.println("the interest is "+i+ "rupees in SBI" );
		
	}
	
	}
class ICICI extends	interest{
	
	void interest(int t,int p)
	{
		
		double i=p*t*7/100;
		System.out.println("the interest is "+i +"rupees in ICICI");
		}
	}
class AXIS extends interest{
	
	void interest(int t,int p)
	{
		double i=p*t*9/100;
		System.out.println("the interest is "+i+"rupees in AXIS");
		}
	}
	
public class overriding{
	public static void main(String [] args)
	{
		ICICI ibank1= new ICICI();
	    ibank1.interest(10,5000);
	    
		SBI ibank2= new SBI();
	    ibank2.interest(10,5000);
	    AXIS ibank3= new AXIS();
	    ibank3.interest(10,5000);
		
		}
	
	
	}
	
