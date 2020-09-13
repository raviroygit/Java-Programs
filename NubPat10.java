// number pattern 10
/*
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
		
		
		for(i=n;i>=1;i--)
		{
			int k=1;
			for(j=1;j<=n;j++)
			{
				if(j<=i){
					System.out.print(""+k+"");

					}
					else 
						System.out.print(" ");
					k++;
			}

			System.out.println();
			
		
		
			
		}
		
	}
}