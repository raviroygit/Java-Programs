/* 11111
   00000
   11111
   00000
   11111*/
   
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
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				if((i)%2==0)
					System.out.print(" 1 ");
				else
					System.out.print(" 0 ");
			}
			System.out.println();
		}
	}
}