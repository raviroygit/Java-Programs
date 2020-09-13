//Series 17,36,132,636,3500,21750,153762....
//Formula (a+i^3),where a=17

import java.util.*;

public class Series1
{
	public static void main(String args[])
	{
		int i,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit(n) of Series: ");
		n=sc.nextInt();
		
		int s=17;
		for(i=1;i<=n;i++)
		{
			s=s+(i*i*i);
			System.out.print(" "+s+" ");
		}
	}
	
}