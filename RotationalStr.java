// check two string is rotational of each other

import java.util.*;

public class RotationalStr
{
	public static void main(String args[])
	{
		String s1,s2;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter 1st String:  ");
		s1=sc.nextLine();
		System.out.println("Enter 2nd String U want to check Rotational or not:  ");
		s2=sc.nextLine();
		
		String s3=s1+s1;
		
		if(s3.contains(s2))
		{
			System.out.println("String is Rotaion of Each other!");
			
		}
		else
			System.out.println("Not a Rotational String !");
		
		
	}
}