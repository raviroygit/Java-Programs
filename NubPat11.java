// number pattern 11
/*

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
		
		int k=1;
		for(i=1;i<=n;i++)
		{
			
			for(j=1;j<=n;j++)
			{
				if(j<=i){
					System.out.print(""+k+"");
                   k++;
					}
					else 
						System.out.print(" ");
					
			}

			System.out.println();
			
		}
		
	}
}