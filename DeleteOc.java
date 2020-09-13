// delete the All occurances from the String

import java.util.*;

public class DeleteOc
{
	public static void main(String args[])
	{
		String s;
		int i;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a String: ");
		s=sc.nextLine();
		
		String s1="";
		char c;
		System.out.println("Enter Character U Want to DeleteOc  ");
		c=sc.next().charAt(0);
		
		char a[]=s.toCharArray();
		
		int n=a.length;
		
		for(i=0;i<n;i++)
		{
			if(a[i]!=c)
			{
				s1=s1+a[i];
			}
		}
		
		System.out.println("After Deleting "+c+" from "+s+" Is :  "+s1);
	}
}