// number pattern 15
/*
 1
 1 2 1
 1 2 3 2 1
 1 2 3 4 3 2 1
 1 2 3 4 5 4 3 2 1
*/

import java.util.*;

public class NubPat2
{
	public static void main(String args[])
	{
		int i,j,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit of Row and Column: ");
		int m=sc.nextInt();
		n=sc.nextInt();
		
		int p=n;
		for(i=1;i<=m;i++)
		{
			
			
			int k=1;
			for(j=1;j<=i;j++)
			{
				System.out.print(" "+j);
				                  
                     
			}
			for(j=i-1;j>=1;j--)
				System.out.print(" "+j);
			
			System.out.println();
			
		}
		
	}
}