// Number pattern 18
/*
12345
 2345
  345
   45
    5
    5
   45
  345
 2345
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
			int p=n;
			for(int k=p;k>i;k--)
				System.out.print(" ");
              int p1=n-i+1;
			for(j=1;j<=i;j++){
							 
				System.out.print(""+p1+"");
				      p1++;
			}
			
			System.out.println();
		}
		
		
		for(i=1;i<=m;i++)
		{
			int p=n;
			for(int k=p;k>i;k--)
			    System.out.print(" ");
		       
			   int p1=n-i+1;
			for(j=1;j<=i;j++)
			{
				System.out.print(""+p1+"");
				              p1++;    
                     
			}
			    
			System.out.println();
			
		}
		
		
	}
}