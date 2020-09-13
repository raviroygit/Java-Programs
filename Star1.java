// star pattern 1


import java.util.*;

public class Star1
{
	public static void main(String args[])
	{
		int i,j,n;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the limit: ");
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=0;j<=i;j++)
				
			{
				
				System.out.print("*");

			}
			System.out.println();
		
			
		}
		
		
		
	}
}