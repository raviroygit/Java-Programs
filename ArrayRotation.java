// Array Rotation..............


import java.util.*;

public class ArrayRotation
{
	public static void main(String args[])
	{
		int i,j,n,r;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size Of Array: ");
		n=sc.nextInt();
		
		int a[]=new int[n];
		System.out.println("Enter the Element of Array: ");
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		System.out.println("How many time U want to Rotate: ");
		r=sc.nextInt();
			
		System.out.print("After Rotation: ");
		for(i=0;i<r;i++)
		{
			int temp=a[0];
			for(j=0;j<n-1;j++)
			{
				
					a[j]=a[j+1];
			}
			a[j]=temp;
			
		}
		for(i=0;i<n;i++)
		   System.out.print(" "+a[i]+" ");
	}
}