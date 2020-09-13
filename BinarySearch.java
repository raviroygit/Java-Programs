// Binary Search Array 

import java.util.*;

public class BinarySearch
{
	public static void main(String args[])
	{
		int i,n,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Total number of Element: ");
		n=sc.nextInt();
		
		
		int a[]=new int[n];
		System.out.println("ENter the element: ");
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		System.out.println("Enter the element U want to Search: ");
		c=sc.nextInt();
		
		
		int low=0;
		int high=n-1;
		int mid;
		
		// sorting
		int temp=0;
		System.out.println("Sorted Array: ");
		for(i=0;i<n;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
				}
				
			}
		}
		System.out.println();
		for(i=0;i<n;i++)
			System.out.print(" "+a[i]+" ");
		while(low<=high)
		{
			mid=(low+high)/2;

			if(a[mid]<c)
			{
				low=mid+1;
			}
			else if(a[mid]>c)
				high=mid-1;
			else if(c==a[mid])
			{
				System.out.println("Element found at position "+(++mid));
				break;
			}
			else if(c!=a[mid]) {
				System.out.println("Emelment Not found!");
			break;
			}
			
		}
		
		
	}
}