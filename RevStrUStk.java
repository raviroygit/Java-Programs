//Reverse String Using Statck

/// WAP to reverse a string or Array using Stack

import java.util.*;


public class RevStrUstk
{
	
	public static void main(String[] args)
	{
		
		int top=0,n,i;
		
		Scanner s=new Scanner(System.in);
		
		String ss;
		System.out.println("Enter the String! ");
		    ss=s.nextLine();
		
		char a[]=ss.toCharArray();
		n=a.length;
		char stack[]=new char[n];
		
		
		
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
		
		System.out.print("Reverse String :! \t");
		
		
			System.out.print(String.valueOf(a));
		
		
	}
	
}