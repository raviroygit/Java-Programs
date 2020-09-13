//Number Pattern 14
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
		
		int p=n;
		for(i=0;i<=n;i++)
		{
			
			for(int k=1;k<=p;k++)
				System.out.print(" ");
			
			int k=1;
			for(j=0;j<=n;j++)
			{
				if(j<=i){
					System.out.print(" "+k+" ");
                 k =k*(i-j)/(j+1);
					}
					else 
						System.out.print(" ");
					  
			}
			p--;

			System.out.println();
			
		}
		
	}
}