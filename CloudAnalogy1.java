//Series 17,36,132,636,3500,21750,153762....
//Formula s=(a+i^3)*k>2,where a=17

import java.util.*;
import java.lang.Math;

public class CloudAnalogy1
{
	public static void main(String args[])
	{
		int i,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit(n) of Series: ");
		n=sc.nextInt();
		
		double s=17,k=2,s1=0;
		for(i=1;i<=n;i++)
		{
			
			System.out.print(" "+s+" ");
			  s1=(s + Math.pow(i,3))*k;
			 s=s1;
			 ++k;
		}
	}
	
}