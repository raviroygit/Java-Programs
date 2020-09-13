// AArmstrong Number

import java.util.*;

public class Armstrong
{
	public static void main(String args[])
	{
		int n,i,len=0,r,arm=0,m=1,n1;
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the A nuber: ");
		n=sc.nextInt();
		
		n1=n;
		while(n1!=0)
		{
			r=n1%10;
			arm=arm+(r*r*r);
			n1=n1/10;
		}
		

		if(n==arm)
		      System.out.println(" enter number is Armstrong");
		else 
			System.out.println("Numbver is not armStrong number!");
	}
}