package Day1;
import java.util.*;
public class DA {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String users[]= {"ajay","kavita","asha","deepa","komal"};
		double salary[]= {10000,20000,40000,10000,20000};
		boolean flag=true;
		System.out.println("Enter the Employee name: ");
		String val = sc.nextLine();
		for(int i=0;i<users.length;i++)
		{
			if((users[i].equals(val)))
			{
				flag=true;
				System.out.println("Salary of " + val + ": " + salary[i]);
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("Found");
		}
		else
		{
			System.out.println("Not found");
		}
	}
}
