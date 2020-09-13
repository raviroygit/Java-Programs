/*5 5 5 5 5 5 5 5 5
  5 4 4 4 4 4 4 4 5
  5 4 3 3 3 3 3 4 5
  5 4 3 2 2 2 3 4 5
  5 4 3 2 1 2 3 4 5
  5 4 3 2 2 2 3 4 5
  5 4 3 3 3 3 3 4 5
  5 4 4 4 4 4 4 4 5
  5 5 5 5 5 5 5 5 5*/
  
    import java.util.*;
public class Star14
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,m,i,j;
		System.out.println("Enter the limit(m*n)");
		m=sc.nextInt();
		n=sc.nextInt();
		int k=1;
		for(i=m;i>=1;i--)
		{
			for(j=n;j>i;j--)
			{
					System.out.print(" "+j+" ");
			}
			for(j=1;j<=(i*2-1);j++)
				System.out.print(" "+i+" ");
			for(j=i+1;j<=n;j++)
				System.out.print(" "+j+" ");
			System.out.println();
		}
		for(i=1;i<m;i++)
		{
			for(j=n;j>i;j--)
			{
					System.out.print(" "+j+" ");
			}
			for(j=1;j<=(i*2-1);j++)
				System.out.print(" "+(i+1)+" ");
			for(j=i+1;j<=n;j++)
				System.out.print(" "+j+" ");
			System.out.println();
		}
		
	}
}