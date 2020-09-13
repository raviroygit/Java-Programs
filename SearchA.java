// Search Element of Array

import java.util.*;

public class SearchA
{
	public static void main(String args[])
	{
		int i,e,n;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("eNTER THE sIZE oF aRRAY= ");
		n=sc.nextInt();
		
		int a[]=new int[n];
		System.out.println("Enter the Array Element = ");
		for(i=0;i<n;i++)
		  a[i]=sc.nextInt();
	  
	  System.out.println("ENter the Emlemnt U want To Search");
	  e=sc.nextInt();
	  
	  int temp=0;
	  System.out.print("Element ");
       for(i=0;i<n;i++)
	   {
		  if(a[i]==e)
		  {
			   
			  System.out.print(" "+a[i]);
			  ++i;
			  temp=i;
			  
		 
		  }
		  
	   }
	  System.out.print(" Found At "+temp);
	  
	  
	  
	   
					
		
		
		
	}
}