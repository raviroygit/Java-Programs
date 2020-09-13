/// find the Fibnaccinusing the Recursion

import java.util.*;

public class FibRec
{
	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the natural Number: ");
		n=sc.nextInt();
		
		System.out.print("Fibonacci Series: ");
		for(int i=0;i<n;i++)
		     System.out.print(" "+fib(i));
		 
		 int a=0,b=1,c=0;
		 System.out.println();
		System.out.print("Fibonacci Series: "+a+" "+b+" ");
		for(int i=0;i<n-2;i++)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
			
		}
	}
	
	  
	
		static int fib(int n)
		{
			if(n==0)
				return 0;
			if(n==1||n==2)
				return 1;
			else
			    return (fib(n-1)+fib(n-2));
			
		}
		
	
	
	
}