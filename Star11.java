import java.util.*;

public class Star11
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
			char k='A';
			for(j=1;j<=c;j++)
			{
				if(j<=i && j<=8-i)
				{
					System.out.print("*");
					
					
				}
				else 
				{
					System.out.print(" ");
					
				}
			}
			System.out.println();
		}
		
		
	}
}