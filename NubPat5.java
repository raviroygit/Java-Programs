// Nuber pattern 5
/*
      1
     1  2
    1  2  3
   1  2  3  4
  1  2  3  4  5
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
		
		int k;
		for(i=1;i<=n;i++)
		{
			
			for( k=n;k>=i;k--)
			{
				System.out.print(" ");
				
				
			}
			for(j=1;j<=n;j++)
			{
				if(j<=i){
					System.out.print(" "+j+" ");

					}
					else 
						System.out.print(" ");
			}

			System.out.println();
			
		}
		
			
		
		
	}
}