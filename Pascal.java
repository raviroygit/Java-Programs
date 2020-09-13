// Pascal Triangle  

import java.util.*;

public class Pascal
{
	public static void main(String args[])
	{
		int i,j,n;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Limit of Row and Column: ");
		n=sc.nextInt();
		
		int s=n;
		
		for(i=0;i<=n;i++)
		{      
	           
			for(int k=1;k<=s;k++)
				System.out.print("   ");
			
			int p=1;
			for(j=0;j<=n;j++)
			{
				if(j<=i){
				  System.out.print("  "+p+"   ");
				 p=p*(i-j)/(j+1);
				}
			  else{
				  System.out.print("   ");
				 
			  }
			}
			s--;
			System.out.println();
		}
		
		
		
	}
}