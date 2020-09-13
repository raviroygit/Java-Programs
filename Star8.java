import java.util.*;

public class Star8
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
	          int k=1;
			for(j=1;j<=c;j++)
			{
				if(j>=5-i && j<=3+i)
				{
					System.out.print(""+k);
					if(j<4)
						k++;
					else
						k--;
				}
				
				else 
					System.out.print(" ");
			
			}
			
			System.out.println();
		}
		
		
	}
}