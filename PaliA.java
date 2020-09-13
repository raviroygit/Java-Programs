import java.util.*;


public class PaliA
{
	
	public static void main(String[] args)
	{
		
		int i,n,p,rem;
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter the palidrtome number limit: ");
		n=s.nextInt();
		
		System.out.println("Eneter the Array element: ");
		int a[]=new int[n];
	     for(i=0;i<n;i++)
			 a[i]=s.nextInt();
		
		boolean flag;
		for(i=0;i<n/2;i++)
		{
             if(a[i]==a[n-1-i])
				 flag=true;
			 else
				 flag=false;
		}
		if(flag=true)
			System.out.print("Palidrome!");
		else
			System.out.print("Not a palidrome!");
		 
	}
}