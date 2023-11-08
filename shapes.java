import java.util.*;
public class shapes
{
	static void area(int r)
	{
		double a=3.14*r*r;
		System.out.println("Area of circle "+a);
	}
	static void area()
	{
	 	Scanner s=new Scanner(System.in);
		System.out.println("Enter base and height");
		int b=s.nextInt();
		int h=s.nextInt();
		System.out.println("Area of triangle is "+(0.5*b*h));
	}
	static void area(int l,int b)
	{
		System.out.println("Area of rectangle  is "+(l*b));
	}
	public static void main(String args[])
	{
		System.out.println("Enter choice-1(circle),2(quad) or 3(triangle)");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		if(n==1)
		{
			System.out.println("Enter radius");
			int r=sc.nextInt();
			area(r);
		}
		if(n==2)
		{
			System.out.println("Enter length and breadth");
			int l=sc.nextInt();
			int b=sc.nextInt();
			area(l,b);
		}
		if(n==3)
		{
			area();
		}
	}
}
