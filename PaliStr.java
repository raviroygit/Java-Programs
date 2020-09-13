//Pali longest String

import java.util.*;

public class PaliStr
{
	
	static void substring(String s,int start,int end)
	{
		System.out.println(s.substring(start,end+1));
	}
	
    private	static String palidrome(String s)
	{
		int i,n;
		n=s.length();
		
		boolean palidrome[][]=new boolean[n][n];
		
		
		// check string at len 1
		int maxlen=1;
		for(i=0;i<n-1;i++)
		{
			palidrome[i][i]=true;
		}
		//check string for length 2
		 int start=0;
		for(i=0;i<n-1;i++)
		{
			if(s.charAt(i)==s.charAt(i+1))
			{
				palidrome[i][i+1]=true;
				start=i;
				maxlen=2;
			}
		}
		// check if string >2
		
		int k,j;
		for(k=3;k<=n;k++)
		{
			for(i=0;i<n-k+1;i++)
			{
				// make last index of string 
				j=i+k-1;
				if(palidrome[i+1][j-1]&& s.charAt(i)==s.charAt(j))
				{
					palidrome[i][j]=true;
					if(k>maxlen)
					{
						maxlen=k;
						start=i;
					}
				}
			}
		}
		
		System.out.println("Longest Palidrome!");
	    substring(s,start,start+maxlen-1);
	
	// check length of longest palidrome
	System.out.println("Length of longest palidrome!");
	return String.valueOf(maxlen);
	}
	
	
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		String s;
		
		System.out.println("Enter the String U want to check Longest Palidrome");
		s=sc.nextLine();
		
		System.out.println(palidrome(s));
	}
	
	
	
	
}