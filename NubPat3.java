// Number Pattern 3
/*
1
12
123
1234
12345
12345
1234
123
12
1
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
		
		for(i=0;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if(j<=i)
					System.out.print(""+j);
				else
					System.out.print(" ");
				
			}
			System.out.println();
			
		}
		for(i=n;i>=1;i--)
		{
			for(j=1;j<=n;j++)
			{
				if(j<=i)
				  System.out.print(""+j);
			  else
				  System.out.print(" ");
			  
			
			}
			System.out.println();
		}
			
		
		
	}
}