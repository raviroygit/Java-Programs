//Java Program to Check if a given Bit Position is set to One or not

import java.util.*;

public class Sanf1
{
	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("ENter decimal number: ");
		n=sc.nextInt();
		
		String s="";
		

		while(n!=0)
		{
			int r=n%2;
			s=s+r;
			n=n/2;
		}
		
		int l=s.length();
		
		System.out.println("Enter position where U want to check: ");
		int m=sc.nextInt();
		
		if((l-m)>=0 && s.charAt(l-m)=='1')
			System.out.println("Enter position bit is : 1");
		else
			System.out.println("Enter positionBitis 0");
	}
}