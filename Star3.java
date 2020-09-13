// Star3

import java.util.*;

public class Star3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int i,j,n;
		
		System.out.println("Enter the limit of Row and Column; ");
		n=sc.nextInt();
		
	    for(i=0;i<=n;i++)
		{
			for(j=0;j<=n;j++)
			{
			    if(j>=n+1-i)
				{
			
				System.out.print("*");
				}
				else 
					System.out.print(" ");
			}
								System.out.println(" ");

			
			
		}
		
		
	}
}
