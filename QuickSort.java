//Quick Sort

import java.util.*;

public class QuickSort
{
	
	int partition(int a[],int low,int high)
	{
		int pivot=a[high];
		int s=(low-1);//s->Smaller index of array
		for(int i=low;i<high;i++)
		{
			if(a[i]<pivot)
			{
				s++;
				int temp=a[s];
				a[s]=a[i];
				a[i]=temp;
			}
		}
		// Swap lower+1 index to high index elment
		int temp=a[s+1];
		a[s+1]=a[high];
		a[high]=temp;
		
		return s+1;//return lower index;
	}
	
	void sort(int a[],int low,int high)
	{
		if(low<high)
		{
			int p=partition(a,low,high);
			
			sort(a,low,p-1);
			sort(a,p+1,high);
		}
	}
	
	static void printArray(int a[])
	{
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			System.out.print(" "+a[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of Array: ");
		int n=sc.nextInt();
		
		int a[]=new int[n];
		
		System.out.println("Enter the Array Elment: ");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		QuickSort s=new QuickSort();
		s.sort(a,0,n-1);
		
		System.out.println("Sorted Array: ");
		printArray(a);
		
	}
	
}

