// find Longest Palidromic Strimng

import java.util.*;


public class LongPali
{
	
	// Print substring
	static void printSubstring(String s,int start,int end)
	{
		System.out.println(s.substring(start,end+1));
	}
	  
	private static String LongestPalidromeSubstring(String s)
	{
		
		int len=s.length();
		int i,j,k;
		
		
		
		boolean[][] palidrome=new boolean[len][len];
		
		// all substring for length 1
		int maxLength=1;
		for(i=0;i<len-1;i++)
		{
			palidrome[i][i]=true;
		}
			// check substring len 2
			
			int start=0;
			for(i=0;i<len-1;i++)
			{
				if(s.charAt(i)==s.charAt(i+1))
				{
					palidrome[i][i+1]=true;
					start=i;
					maxLength=2;
				}
			}
			
			// check if length >2
			
			for(k=3;k<=len;k++)
			{
				//fixed starting index
			  for(i=0;i<len-k+1;i++)
			  {
				  // ending index of substring 
				  j=i+k-1;
				  
				  //check substring ith & jth index
				if((j-i<=2 || palidrome[i+1][j-1]) && s.charAt(i)==s.charAt(j) )
				{
					palidrome[i][j]=true;
					
					if(k > maxLength)
					{
						maxLength=k;
						start=i;
						
					}
				}
			  }
			}
		
		
		System.out.println("Logest Palidromie ");
		printSubstring(s,start,start + maxLength -1);
		
	    System.out.println();
		
		System.out.println(" Length of Logest Palidrome = ");
		return String.valueOf(maxLength);
		
		
	}
	public static void main(String[] args)
	{
		String s;
		
		Scanner a=new Scanner(System.in);
		
		System.out.println("Enter the String ! ");
		s=a.nextLine();
		System.out.println();
		
		System.out.println(LongestPalidromeSubstring(s));
	}
	
}