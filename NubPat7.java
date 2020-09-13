import java.util.*;
//Number Pattern 7
/*
54321
5432
543
54
5
5
54
543
5432
54321
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
			int k=5;
			for(j=1;j<=n;j++)
			{
				if(j<=i){
					System.out.print(""+k);
                      
					}
				else 
				 System.out.print(" ");
			 k--;
			}
			

			System.out.println();
		}
			
			for(i=1;i<=n;i++)
			{
				int k=5;
				for(j=1;j<=n;j++)
				{
					if(j<=i)
						System.out.print(""+k);
					else
						System.out.print(" ");
					k--;;
				}
				System.out.println();
			}
			
		
		
			
		
		
	}
}