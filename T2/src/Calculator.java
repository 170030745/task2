
	import java.io.*;
	import java.util.*;
	public class Calculator
	{
	static int  add(int a, int b)
	{
	int c= a+b;
	return c;
	}
	static int  sub(int a, int b)
	{
	int c= a-b;
	return c;
	}
	static int  mul(int a, int b)
	{
	int c= a*b;
	return c;
	}
	static int  div(int a, int b)
	{
	int c= a/b;
	return c;
	}
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("please enter the value of x");
	int x=sc.nextInt();
	System.out.println("please enter the value of y");
	int y=sc.nextInt();
	System.out.println("please select from the given options");
	System.out.println("1.Addition");
	System.out.println("2.Substraction");
	System.out.println("3.Multiplication");
	System.out.println("4.Divison");
	int k=sc.nextInt();
	if(k==1)
	System.out.println("The additon of given numbers is "+add(x,y));
	if(k==2)
	System.out.println("The substraction of given numbers is "+sub(x,y));
	if(k==3)
	System.out.println("The multipliction of given numbers is "+mul(x,y));
	if(k==4)
	System.out.println("The divison of given numbers is "+div(x,y));
	}
}
