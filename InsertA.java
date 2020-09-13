// insert a	 element in array


import java.util.*;

public class InsertA
{
	
	public static void main(String[] args)
	{
		int i,p,e,n;
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the length of the array!= ");
		n=sc.nextInt();
		
		int a[]=new int[n];
		
		System.out.println("Enter the Array Elemnt");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int temp=0;
		int len=a.length;
		
		System.out.println("Enter the Position Where want to insert Element= ");
		p=sc.nextInt();
		
		System.out.println("Enter the Element = " );
		e=sc.nextInt();
		
			System.out.println();
		System.out.println("Deleted Element= "+a[len-1]);
		
		for(i=len-1;i>p-1;i--)
		{
			
			a[i]=a[i-1];
			
		}
		a[p-1]=e;
		
		System.out.print("After INsertion Array =  ");
		for(i=0;i<n;i++)
		{
			System.out.print("  "+a[i]);
		}
		
		
		
		
		
		
	}
}