 import java.util.*;
public class ProductOfArray2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size Of Array: ");
        int n=sc.nextInt();
		System.out.println("Enter the Element of Array: ");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int p=1;
		int i;
		int pd[]=new int[n];
		for(i=0;i<n;i++)
		{
			pd[i]=p;
			p *=a[i];
		}
		p=1;
		
		for(i=n-1;i>=0;i--)
		{
			pd[i]*=p;
			
			p*=a[i];
			
		}
		
		System.out.println("===By Roy 2===!Product of given Array: ");
		for(i=0;i<n;i++)
			System.out.print(" "+pd[i]+" ");
		
	}
}
 
 
 
 
 
 
 