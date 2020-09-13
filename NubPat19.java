// Number Pattern 19
/*
1 2 3 4 5 
 2 3 4 5 
  3 4 5 
   4 5 
    5 
    5 
   4 5 
  3 4 5 
 2 3 4 5 
1 2 3 4 5 
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
			for(j=1;j<=i;j++)
			{
				System.out.print(" "+p1);
				p1++;
			}
			System.out.println();
		}
		for(i=1;i<=n;i++)
		{
			int p=n;
			for(int k=p-1;k>=i;k--)
				System.out.print(" ");
			int p1=n-i+1;
			for(j=1;j<=i;j++){
				System.out.print(" "+p1);
			p1++;}
			System.out.println();
		}
		
		
	}
}