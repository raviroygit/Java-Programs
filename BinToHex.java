//convert Bin To Hex

import java.util.*;

public class BinToHex
{
	public static void main(String args[])
	{
		int r1,r2,n,d=0,i=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Binary number= ");
		n=sc.nextInt();
		
		// conversion of Bin to Dec
		while(true)
		{
			
			if(n==0)
				break;
			else
			{
			
			r1=n%10;
			d+=r1*Math.pow(2,i);
			n=n/10;
			i++;
			}
		}
		
		//System.out.println("Bin to Dec number= "+d);
		n=d;
		// Now Dec to Hex conversions Beging
		
		char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		String s=" ";
		
		
		while(n>0)
		{
			r2=n%16;
			s += s + hex[r2];
			n=n/16;
			
		}
		System.out.print("Hex Number="+""+s+"");
		
		
	}
}