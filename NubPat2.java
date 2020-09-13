// Number pattern 1

/*
12345
2345
345
45
5
1
12
123
1234
12345
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
		
		for(i=n;i>=1;i--)
		{
			for(j=1;j<=n;j++)
			{
				if(j<=i){
					System.out.print(""+j);
					
				}
				else
					System.out.print("");
			}
			System.out.println("");
			
		}
		   for(i=1;i<=n;i++)
			{
			for(j=1;j<=n;j++)
			{
				if(j<=i ){
					
					System.out.print(""+j);
					
				}
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
			
		
		
	}
}