// Find Two string are Anagram or not

import java.util.*;

public class AnagramStr
{
	public static void main(String[] args)
	{
		
		String s1,s2;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the 1st String:\t");
		s1=sc.nextLine();
		
		System.out.print("Enter the 2nd String:\t");
		s2=sc.nextLine();
		
		char a[]=s1.toCharArray();
		char b[]=s2.toCharArray();
		
		
		int n1=s1.length();
		int n2=s2.length();
				
		if(n1==n2)
		{
			int i,j;
			char temp;
			
			// Sorting for 1st Array
			for(i=0;i<n1-1;i++)
			{
				for(j=0;j<n1-i-1;j++)
				{
					if(a[j]>a[j+1])
					{
						temp=a[j];
						a[j]=a[j+1];
						a[j+1]=temp;
						
					}
					
					
				}
			}
			System.out.println("1st Sorted Array= \t");
			for(i=0;i<n1;i++)
				System.out.println(a[i]+"");
			
			// Sorting for 2nd Array
			for(i=0;i<n2-1;i++)
			{
				for(j=0;j<n2-i-1;j++)
				{
					if(b[j]>b[j+1])
					{
						temp=b[j];
						b[j]=b[j+1];
						b[j+1]=temp;
						
					}
					
					
				}
			}
			System.out.println("1st Sorted Array= \t");
			for(i=0;i<n2;i++)
				System.out.println(b[i]+"");
			
			for(i=0;i<1;i++)
			{
			if(a[i]!=b[i])
				System.out.println("String is Not Anagram");
			else
				System.out.println("String is Anagram!");
			}
			
						
		}
		
		else 
			System.out.println("String Length Is Not Equal : Enter Same LEngth of String");
		
		
	}
	
	
}