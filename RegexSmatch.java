/// Match the String Using Regular Expression and Example Of Regulare Expression 1st time attepmt

import java.util.*;
import java.util.regex.*;


public class RegexSmatch
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		

		
		System.out.println("Choose any one of them :!");
		System.out.println(" ");
		System.out.println("1. Check both String are Matched Or Not ");
		System.out.println("2. Check if want to only one Chracter From The String ");
		
		System.out.println(" ");
		
		System.out.print("How many time U want Check! ");
		int n=sc.nextInt();
	
		System.out.println(" ");
		
		System.out.println("Enter Your Choice From 1-2");
		int c=sc.nextInt();
		
		
		
		/*System.out.println("Enter The Full String Passage:! ");
		String s1;
		s1=sc.nextLine();
		
		System.out.println("Enter the String U want To check Present or Not :!  ");
		String s2;
		s2=sc.nextLine();*/
		

		
		while(n>0)
		{
		switch(c)
		{
			case 1:
			{
				String s1="abc";
				System.out.println("Enter The Full String Passage:! ");
		        s1=sc.nextLine();
		
		       System.out.println("Enter the String U want To check Present or Not :!  ");
		       String s2;
		       s2=sc.nextLine();
			   
			   	int l1=s1.length();
                int l2=s2.length();				
			   if(l1==l2)
			   {
				   Pattern p =Pattern.compile("[abcd]");
		            Matcher m =p.matcher(s2);
                System.out.println(" ");
				
				System.out.print("String ");
		      while(m.find())
			     System.out.print(s2.substring(m.start(),m.end()));
			   System.out.println("  Matched! and Same");
			   }
			   else
				   		System.out.println(" String Are Not Matched ");
			}
			
			
		}
		n--;
		
		}
		
	}
	
	
}