// calculate factorial using Recursion

import java.util.*;
public class FactRec
{
	public static void main(String args[])
	{
		
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		n=sc.nextInt();
		
		FactRec f=new FactRec();
		f.calculatefact(n);
		
		System.out.println("Factorial "+fact);
	}
	static int fact=1;
	void calculatefact(int n)
	{
		
		if(n>1)
		{
			fact=fact*n;
			calculatefact(n-1);
			
		}
		
	}
}