/// bubble sort 2

import java.util.*;

public class BubbleSort2
{
	
	public static void main(String[] args)
	{
		int n,i,j;
		int temp=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Entere the size of element: ");
		n=sc.nextInt();
		
		int a[]=new int[n];
		
		System.out.println("Enter the array element: ");
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		//n=a.length;
		
		for(j=0;j<n-1;j++)
		{
			for(i=0;i<n-j-1;i++)
			{
				if(a[i]>a[i+1])
				{
					temp=a[i+1];
					a[i+1]=a[i];
					a[i]=temp;
				}				
			}
			
		}
		System.out.print("Sorted artray:  ");
		for(i=0;i<n;i++)
			System.out.print(" "+a[i]);
		
	}
	
	
}