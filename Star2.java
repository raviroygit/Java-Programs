// Star2

import java.util.*;

public class Star2
{
	public static void main(String args[])
	{
		int i,j,n;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Limit of Row and Column: ");
		n=sc.nextInt();
		
		for(j=n;j>=0;j--)
		{
			for(i=0;i<j;i++)
			{
				
				System.out.print("*");
			      
			}
			System.out.println();
		}
		System.exit(0);
	}
}