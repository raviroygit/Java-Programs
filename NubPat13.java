// Number pattern 13
/*
1
27
3813
491419
510152025
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
		
		
		for(i=1;i<=n;i++)
		{
			int k=i;
			for(j=1;j<=n;j++)
			{
				if(j<=i){
					System.out.print(""+k+"");
                   k=k+5;
					}
					else 
						System.out.print(" ");
					
			}

			System.out.println();
			
		}
		
	}
}