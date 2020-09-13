import java.util.*;

public class Star9
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
				if(j<=6-i || j>=4+i)
				{
					System.out.print(""+k);
					if(j<5)
						k++;
					else
						k--;
					
				}
				else 
				{
					System.out.print(" ");
					if(j==5)
						k--;
				}
			}
			System.out.println();
		}
		
		
	}
}