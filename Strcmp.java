// Compare two string are equal or not without using build in function

import java.util.*;



public class Strcmp
{
	public static void main (String args[])
	{
		
		String s1,s2;
		int i,flag=1,len1,len2;
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enterthe 1st String: ");
		s1=s.nextLine();
		System.out.println("Enter the 2nd String: ");
		s2=s.nextLine();
		
		len1=s1.length();
		len2=s2.length();
		
		char str1[]=s1.toCharArray();
		char str2[]=s2.toCharArray();
		
		
			
		if(len1==len2)
		{
			for(i=0;i<len1;i++)
			{
				if(str1[i]!=str2[i])
				{
					flag=0;
					break;
				}
			}
			
			
		}
        else
		{
			flag=0;
			
		}
		if(flag==1)
		{
			System.out.println("Both String are Equals!");
			System.out.println(s1+" = "+s2);
		}
		else
		{
			System.out.println("Enter String are Not Equals!");
			System.out.println(s1+" != "+s2);
		}
		
		
		
		
	}
	
}