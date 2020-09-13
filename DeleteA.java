// delete array element from the array

import java.util.*;

public class DeleteA
{
	public static void main(String args[])
	{
	int i,n,p;
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("ENter the SIze of Array");
	n=sc.nextInt();
	
	int a[]=new int[n];
	System.out.println("Enter the Array Elment= ");
	for(i=0;i<n;i++)
		 a[i]=sc.nextInt();
	 
	 System.out.println("Enter position U want To Delete = ");
	  p=sc.nextInt();
	  
	  int temp=0;
	  
		 if(p<=0||p>n)
		 {
			 System.out.println("Plaese Enter A Valid Position");
			 System.exit(0);
		 }
	  if(p<=n)
	  {
		  i=p-1;
		temp=a[i];

	 for(i=p-1;i<n-1;i++)
	 {
		 a[i]=a[i+1];
	 }
	 n=n-1;
	  }
	 
	 System.out.println("Afteer Deleting Array Element= ");
	 for(i=0;i<n;i++)
		 System.out.print(" "+a[i]);
	 
	 System.out.println();
	 
	 System.out.println("Deleted Element "+temp);
	}
}