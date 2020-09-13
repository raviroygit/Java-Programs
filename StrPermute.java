// print all permutation of string

import java.util.*;

public class StrPermute
{
	public static void main(String[] args)
	{
		String s;
		int i,len;
		
		
		Scanner a=new Scanner(System.in);
		
		System.out.println("Enter the string !");
		s=a.nextLine();
		System.out.println();
		
		len=s.length();
		int r=len-1;
        int l=0;
		
		
		System.out.println("Permutation of Given String!: "+s);
		StrPermute permutation=new StrPermute();
		permutation.permute(s,0,len-1);
		
		
	}
	private void permute(String s,int l,int r)
	{        int i;
				if(l==r)
		{
			System.out.println(s);
		}
		for(i=l;i<=r;i++)
		{
			s=swap(s,l,i);
			permute(s,l+1,r);
			s=swap(s,l,i);
			
		}
		
	}
	
	private String swap(String a,int i,int j)
	{
		char temp;
		char[] charArray=a.toCharArray();
		temp=charArray[i];
		charArray[i]=charArray[j];
		charArray[j]=temp;
		return String.valueOf(charArray);
	}
	
}