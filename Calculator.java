import java.util.Scanner;
class Binary_Operation{
		public Binary_Operation(){
			
			}
		private int fno,sno;
		public void setFno(int fno){
			this.fno=fno;	
		}
		public int getFno(){
			return fno;	
		}
		public void setSno(int sno){
			this.sno=sno;
		}
		public int getSno(){
			return sno;	
		}
		public Binary_Operation(int fno,int sno){
			this.fno=fno;
			this.sno=sno;
			
			
			}
		public int getResult(char opr){
			int r=0;
			switch(opr){
				case '+':r=fno+sno;
						break;
				case '-':r=fno-sno;
						break;
				case '*':r=fno*sno;
						break;
				case '/': r=fno/sno;
						break;
				default: System.out.println("Invalid operator");
						break;
				}
			return r;
			}
	}

public class Calculator{
	static int m,n;
	static char op;
	public static void main(String [] args){
	Scanner scan= new Scanner(System.in);
	System.out.print("enter the first number:");
	m=scan.nextInt();
	System.out.print("\nenter the second number:");
	n=scan.nextInt();
	System.out.print("\nenter the operation you want to do: ");
	op=scan.next().charAt(0);
	scan.close();
	
	Binary_Operation b1=new Binary_Operation();
	Binary_Operation b2= new Binary_Operation(10,5);
	b1.setFno(m);
	b1.setSno(n);
	int k2=b2.getResult(op);
	int k1=b1.getResult(op);
	System.out.println("\n\nThe required value is : "+k1);
	System.out.println("\n\nThe rewuired value (through constructor) is: "+k2);
	}
}
