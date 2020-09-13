// Search 1st string are availavble in 2nd string or not


import java.util.*;


public class Matchstr 
{
	
	public static void main(String[] args)
	{
		int i,flag=1,len1,len2;
		String s1,s2;
		
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the 1st String! ");
		s1=s.nextLine();
		System.out.println("Enter the 2nd String! ");
		s2=s.nextLine();
		
		len1=s1.length();
		len2=s2.length();
		
		
		
		for(i=0;i<=len1;i++)
		{
			if(s2.contains(s1))
			{
				
					flag=1;
					break;
				
			}
			else 
			{
				flag=0;
			}
			
		}
		System.out.println();
		if(flag==1)
		{
			
			System.out.println(s1+" Matched in  "+s2);
			System.out.println(" String 1 is Available in String 2!!");
		}
		
		else{
			System.out.println("String is not matched! ");
			System.out.println(s1+" not Matched "+s2);
		}
		
		
		
	}
}