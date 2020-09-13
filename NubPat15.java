import java.util.*;
// Number Pattern 15
/*
1 2 3 4 5 
 1 2 3 4 
  1 2 3 
   1 2 
    1 
*/

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
			for(int k=i-1;k<=p;k++)
				System.out.print(" ");
			for(j=1;j<=i;j++)
			{
				System.out.print(" "+j+" ");
				                  
                     
			}
			p--;
			System.out.println();

		}
		
	}
}