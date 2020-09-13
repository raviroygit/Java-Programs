// Folyd triangle/

import java.util.*;

public class FolydTri
{
	public static void main(String args[])
	{
		int i,j,n,m;

         Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Limit of Row and Column: ");
         n=sc.nextInt();
         m=sc.nextInt();
            
			int k=1;
		for(i=1;i<=n;i++)
		{
			
			for(j=1;j<=m;j++)
			{
				if(j<=i )
					System.out.print("  "+k++);
				else
					System.out.print(" ");
					
			}
			System.out.println();
		}
	}
}