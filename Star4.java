// Star4

import java.util.*;

public class Star4
{
	public static void main(String args[])
	{
		int i,j,n;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit of FRows and Column: ");
		n=sc.nextInt();
		
		for(i=1;i<=n;i++)
		{    
	         int  k=1;
			for(j=1;j<=n;j++)
			{   
				if(j>=i )
				{
					System.out.print(" ");
					
				}
				else
					System.out.print(" "+k++);
				
			}
			System.out.println("");
		}
	}
}