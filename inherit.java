class employee
{
	String name,addresss;
	int age;
	employee(String n,String ad,int a)
	{
		System.out.println("the name is "+n);
		System.out.println("the address is "+ad);
		System.out.println("the age is "+a);
	}
}
class manager_of_worker extends employee
{
	String department;
	int salary;
	manager_of_worker(String nam,String add,int ag,String dep,int sala)
	{
		super(nam,add,ag);
		System.out.println("the department is "+dep);
		System.out.println("the salary is "+sala);
	}
}
class worker extends employee
{
	int no_of_days;
	int daily_wages;
	worker(String na,String a,int age,int nd,int dw)
	{
	super(na,a,age);
	int monthsal=nd*dw;
	System.out.println("number of days worked is "+nd);
	System.out.println("daily wags are Rs "+dw);
	System.out.println(" the monthly salary is "+monthsal);
	}
}
public class inherit
{
	public static void main(String args[])
	{ 
	manager_of_worker ob1=new manager_of_worker("ram","taghoria",43,"math",56987);
System.out.println(" ");
 worker ob2=new worker("sam","howrah",23,24,678);
}
}
