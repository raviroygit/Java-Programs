// Star7

import java.util.*;

public class Star7
{
	public static void main(String args[])
	{
		int i,j,r,c;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the limit of Rows And Colmun: ");
		r=sc.nextInt();
		c=sc.nextInt();
		
		for(i=1;i<=r;i++)
		{
			for(j=1;j<=c;j++)
			{
				if(j<=6-i || j>=4+i)
					System.out.print("*");
				else 
					System.out.print(" ");
			}
			System.out.println();
		}
		
		
	}
}