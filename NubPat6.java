// number pattern 6
/*
1
22
333
4444
55555
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
			
			for(j=1;j<=n;j++)
			{
				if(j<=i){
					System.out.print(""+i+"");

					}
					else 
						System.out.print(" ");
			}

			System.out.println();
			
		
		
			
		}
		
	}
}