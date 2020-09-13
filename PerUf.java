// find the permutation using Formula  =n!/(n-r)!
//where r-> number of letters
// FAILD


import java.util.*;

public class PerUf
{
	public static void main(String args[])
	{
		int i,n;
		String s;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		s=sc.nextLine();
		
		char a[]=s.toCharArray();
		 n=a.length;
		
		//System.out.println("Length of the Char= "+n);
		// find factorial of length
		int f=1;
		
		for(i=1;i<=n;i++)
		{
			f=f*i;
			
			
		}
		System.out.println("Factorial of n= "+f);
		// count the letters from string
		int r=1;
		char temp;
		for(i=0;i<n;i++)
		{
				for(int j=0;j<f;j++)
				{
					if(a[i+1]!=a[j-1])
					{
					temp=a[i];
					a[j]=a[i];
					a[i]=temp;
					}
					System.out.print(""+a[i]);
				}
			System.out.println("Value of r = "+a[i]);
			
		}
		
		
		
		
		
	}
}