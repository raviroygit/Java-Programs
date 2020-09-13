// Find Permutation of a number

import java.util.*;

public class Combination
{
	public static void main(String[] args)
  {
	  
	  
	  Scanner sc=new Scanner(System.in);
	  
	  System.out.println("Eneter the String or Number U want to get Combination : \t");
	  String s=sc.nextLine();
	  
	  System.out.println("");
	  System.out.println("My String Combination See Below!");
	  int n=s.length();
	  int l=n-1;
	  int f=0;
	  
	  Combination permutation=new Combination();
	  
	  permutation.permute(s,0,n-1);
	  
	  
	  
  }


   private String Swap(String s1,int i,int j)
   {
	   
   char temp;
   char[] c=s1.toCharArray();
   temp=c[i];
   c[i]=c[j];
   c[j]=temp;
   return String.valueOf(c);
  }
private void permute(String s,int f,int l)
	{        int i;
				if(f==l)
		{
			System.out.print(s+" ");
		}
		else{
		for(i=f;i<=l;i++)
		{
			s=Swap(s,f,i);
			permute(s,f+1,l);
			s=Swap(s,f,i);
			
		}
		System.out.println();
		}
		
	}
}