// conv ert binary to decimal


import java.util.*;

public class DectoBin1
{
	public static void main(String args[])
	{
		int n,i=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Decimal Number  = ");
		n=sc.nextInt();
		
		int a[]=new int[n];
		System.out.println("Binary Number After ConversionS = ");
		while(n>0)
		{
			a[i++]=n%2;
			n=n/2;
		}
		for(i=i-1;i>=0;i--)
			System.out.println(""+a[i]);
		
	}
}