// print Duplicate Chracter form String
//Failed

import java.util.*;

public class DupliStr
{
	public static void main(String[] args)
	
	{
		int i,j;
		String s;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the String: \t");
		s=sc.nextLine();
		
	     char a[]=s.toCharArray();
		 
		 int n=s.length();
		 
		 // Now Sorting procedure is start
		
		 char temp;
		 
		 
		 for(i=0;i<n-1;i++)
		 {
			 for(j=0;j<n-i-1;j++)
			 {
				 
				 if(a[j]>a[j+1])
				 {
					 temp=a[j];
					 a[j]=a[j+1];
					 a[j+1]=temp;
				 }
				 
			 }
		 }
		 System.out.print("Sorted Array are: \t");
		 for(i=0;i<n;i++)
		 {
			 System.out.print(""+a[i]);
		 }
		 
		 System.out.println("");
		 System.out.print("All String repeated  element: ");
		 for(j=0;j<n-1;j++)
		 {
			 
			 if(a[j]==a[j+1])
				 System.out.print(""+a[j+1]);
			 
		 }		 
		 System.out.print(""+a[n-1]);
		 System.out.println();
		 
		 System.out.println("Repeated Element: ");
		 if(a[i-1]>1)
		 {
			 for(j=0;j<n-1;j++)
		 {
			 
			 if(a[j]!=a[j+1])
				 System.out.print(""+a[j]);
			 
		 }		 
		 //System.out.print(""+a[n-1]);
		 }
		
		 
	}
}