//Merge Sort

import java.util.*;

public class MergeSort
{
	void mergesort(int a[],int l,int h)
	{
		if(l<h)
		{
			int mid=(l+h)/2;
			mergesort(a,l,mid);
			mergesort(a,mid+1,h);
			merge(a,l,mid,h);
		}
	}
	
	
	void merge(int a[],int l,int mid,int h)
	{
		int n1=mid-l+1;
		int n2=h-mid;
		
		int L[]=new int[n1];
		int R[]=new int[n2];
		
		// copy Emelent to Temp array L[] and R[]
		for(int i=0;i<n1;++i)
			L[i]=a[l+i];
		for(int j=0;j<n2;++j)
			R[j]=a[mid+1+j];
		
		// merge
		int i=0,j=0,k=l;
		while(i<n1 && j<n2)
		{
		   if(L[i]<=R[j])
		   {
			   a[k]=L[i];
			  i++;
			
		    }
		    else
		     {
			     a[k]=R[j];
			       j++;
		      }
		   k++;
	    }
	
	   while(i<n1)
	   {
		   a[k]=L[i];
		   i++;
		   k++;
	   }
	   while(j < n2)
	   {
		   a[k]=R[j];
		   j++;
		   k++;
	   }
		
		
	}
	
	static void printArray(int a[])
	{
		int n=a.length;
		for(int i=0;i<n;i++)
			System.out.println(" "+a[i]+" ");
		System.out.println();
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size Of Array: ");
		int n=sc.nextInt();
		
		int a[]=new int[n];
		System.out.println("Enter the Element U want to Sort: ");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		MergeSort m=new MergeSort();
		m.mergesort(a,0,n-1);
		
		System.out.println("Sorted Array: ");
		printArray(a);
	}
}