/// WAP to reverse a string or Array using Stack

import java.util.*;


public class RevStkAry
{
	
	public static void main(String[] args)
	{
		
		int top=0,n,i;
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the size Array! ");
		    n=s.nextInt();
		
		int a[]=new int[n];
		int stack[]=new int[n];
		
		System.out.print("Enter the Array element! \t");
		for( i=0;i<=n-1;i++)
		{
			a[i]=s.nextInt();
		}
		
		// Create a loop for push function
		
		for(i=0;i<n;i++)
		{
			stack[top]=a[i];
			if(top==(n-1))
			{
				break;
			}
			top++;
		}
		// create a loop for Pop fuction
		
		for(i=0;i<n;i++)
		{
			a[i]=stack[top];
			
			if(top<0)
			{
				break;
			}
			top--;
		}
		
		// now print array and get reverse order 
		
		System.out.print("Reverse Array :! \t");
		for(i=0;i<n;i++)
		{
			System.out.print(" "+(a[i]));
		}
		
	}
	
}