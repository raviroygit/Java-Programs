///fIND LONGEST PALIDROME without using Method
//Successfull

import java.util.*;

public class LongPali1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		
		String s;
		System.out.println("Enter the String: ");
		s=sc.nextLine();
		
			int i,j,k;
					int n1=s.length();
		boolean palidrome[][]=new boolean[n1][n1];
		      int n=palidrome.length;
		// Check for length 1
		int maxlen=1;
		for(i=0;i<n-1;i++)
		{
			if(s.charAt(i)==s.charAt(i))
			{
				palidrome[i][i]=true;
			}
		}
		
		// check for len 2
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
		
		//check if length greater than 2
		
		for(k=3;k<=n;k++)
		{
			
			for(i=0;i<n-k+1;i++)
			{
				j=i+k-1;//for last index
				if(j-i<=2|| s.charAt(i)==s.charAt(j) && palidrome[i+1][j-1])
				{
					palidrome[i][j]=true;
					
					if(k>maxlen)
					{
					start=i;
					maxlen=k;
					}
				}
			}
		}
		
		System.out.println("Longest Palidrome! ");
		System.out.println(s.substring(start,start+maxlen));
		
		// check length of longest palidrome
		System.out.println("Length of LongestPalidrome= "+maxlen);
		
		
		
	}
	
	
}