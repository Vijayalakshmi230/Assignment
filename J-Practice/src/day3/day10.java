package day3;
import java.util.*;

public class day10 {
	private int a;
	private int b;
	
	public void dog(int a)
	{
		this.a=a;
		System.out.println("The value of a is: "+a);
	}
	public void dog(int a,int b)
	{
		this.a=a;
		System.out.println("The value of a is: "+a);
		this.b=b;
		System.out.println("The value of b is: "+b);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a=sc.nextInt();
		System.out.println("Enter the vaule of b:");
		int b=sc.nextInt();
		
		day10 d1 = new day10();
		d1.dog(a);
		d1.dog(a,b);
	}
	

}
