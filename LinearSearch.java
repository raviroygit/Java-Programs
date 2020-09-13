// Linear Search

import java.util.*;
public class LinearSearch
{
	public static void main(String args[])
	{
		int i,n;
		Scanner sc=new Scanner(System.in);
		String s;
		System.out.println("Enter the Element: ");
		s=sc.nextLine();
		
		System.out.println("Enter the Element U want to search: ");
		char p=sc.next().charAt(0);
		
		char a[]=s.toCharArray();
		n=a.length;
		
		
		for(i=0;i<n;i++)
		{
			if(a[i]==p)
				System.out.println(a[i]+"Element is Found! At "+i+" Position");
		}
		
		
		
	}
}