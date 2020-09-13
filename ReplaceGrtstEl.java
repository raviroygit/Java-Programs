// Replace every element with the greatest element on right side

import java.util.*;

public class ReplaceGrtstEl
{
	public static void main(String args[])
	{
		int i,max,temp,n;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of Array: ");
		n=sc.nextInt();
		
		int a[]=new int[n];
		System.out.println("Enter the Element of Array: ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		temp=a[n-1];
		max=a[n-1];
		
		a[n-1]=-1;
		
		int temp1=a[0];
		int temp2=a[1];
		for(i=n-2;i>=0;i--)
		{
			temp=a[i];
		     a[i]=max;
			 
			 if(max<temp)
			 {
				 max=temp;
			 }
			 
		}
		
		System.out.println(" New Array: ");
		if(temp1>temp2)
				System.out.print(""+temp1+" ");
		for(i=0;i<n;i++)
		    System.out.print(""+a[i]+" ");
		
		
	}
}