// Hollow Triangle/

import java.util.*;

public class StarH1
{
	public static void main(String args[])
	{
		int i,j,n;

         Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Limit of Row and Column: ");
         n=sc.nextInt();

            
			int k=1;
		for(i=1;i<=n;i++)
		{
			
			for(j=1;j<=n;j++)
			{
				
				
		       if( i==n || j==1|| j==i)
					  System.out.print("*");
				
					
				else
					System.out.print(" ");
					
			}
			System.out.println();
		}
	}
}