import java.util.*;
class Batsman
{
Scanner s=new Scanner(System.in);
int total,run1,inning,run2,run3,run4,run5;
public void run(int x)
{run1=x;
}
public void  next_inning()
{System.out.println("Enter the  2nd inning");
run2=s.nextInt();
System.out.println("Enter the  3rd inning");
run3=s.nextInt();
System.out.println("Enter the  4th inning");
run4=s.nextInt();
System.out.println("Enter the  5th inning");
run5=s.nextInt();
}
public void total()
{
System.out.println("Total run="+(run1+run2+run3+run4+run5));
}
}
class Bowler
{Scanner s=new Scanner(System.in);
int wicket1,run1,wicket2,run2,wicket3,run3,wicket4,run4,wicket5,run5;
public void wicket(int x,int y)
{wicket1=x;
run1=y;
}
public void nextinning()
{System.out.println("Enter the run and wicket 2nd inning");
run2=s.nextInt();
wicket2=s.nextInt();
System.out.println("Enter the run and wicket 3rd inning");
run3=s.nextInt();
wicket3=s.nextInt();
System.out.println("Enter the run and wicket 4th inning");
run4=s.nextInt();
wicket4=s.nextInt();
System.out.println("Enter the run and wicket 5th inning");
run5=s.nextInt();
wicket5=s.nextInt();
}
public void totall()
{System.out.println("Total run="+(run1+run2+run3+run4+run5));
System.out.println("Total wickets="+(wicket1+wicket2+wicket3+wicket4+wicket5));
}
}
class Bat
{
public static void main(String args[])
{
Batsman obj=new Batsman();
Bowler obj1=new Bowler();
obj.run(30);
obj.next_inning();
obj.total();
obj1.wicket(4,40);
obj1.nextinning();
obj1.totall();
}
}


