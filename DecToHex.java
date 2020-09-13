// convert decimal to heaxa decimal

import java.util.*;

public class DecToHex
{
	public static void main(String args[])
	{
		int n,r;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Decimal number= ");
		n=sc.nextInt();
		
		String str=" ";
		
		char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		
		while(n>0)
		{
			r=n%16;
			str =hex[r]+str;
			n=n/16;
		}
		System.out.println("HexaDecimal Number="+str+"");
	}
}