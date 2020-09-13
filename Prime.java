import java.util.Scanner;

public class Prime
{
	
	public static void main(String[] args)
	{
		
		int n,i;
		float rem,p;
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the limit of number: ");
		 n=s.nextInt();
		 
		
		System.out.println("This is prime numbver: ");
		for(i=1;i<n;i++)
		{
			
			
				if(i%2==0)
				{
				System.out.println(" ");
				}
				else
					System.out.print("\t"+i);
		}
		
	}
}