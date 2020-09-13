// Star5

import java.util.*;

public class Star5
{
	public static void main(String args[])
	{
		int i,j,n,c,r;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the limit of FRows and Column: ");
		r=sc.nextInt();
		c=sc.nextInt();
		
		for(i=1;i<=r;i++)
		{    
	         int k;
			 
			for(j=1;j<=c;j++)
			{   
				if(j>=6-i && j<=4+i  && k )
					
				{
				     //if(j>=r-i && j<=r+i)
					  //   System.out.print(" ");
				     //else
					  System.out.print("*");
					k=0;
				}
				else 
				{
					System.out.print(" ");
					k=1;
				}
				
				
			}
			System.out.println("");
			
			
			
		}
	}
}