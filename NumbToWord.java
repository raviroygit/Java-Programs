
// Convert Number to words

import java.util.*;

public class NumbToWord
{
	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		n=sc.nextInt();
		try{
		if(n==0)
			System.out.println("Zero");
		else
			System.out.println(" Number To Words: "+nToW(n));
		}
		catch(Exception e)
		{
			System.out.println("Please Enter a Valid Number!");
		}
		
	}
	public static String nToW(int n)
	{
		String unit[]={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine",
		"Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
		String ten[]={"Zero","Ten","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
		
		String words=" ";
		if(n==0)
			return "Zero";
		if(n<0)
		{
			String negative=""+n;
			negative=negative.substring(1);
			return "minus"+nToW(Integer.parseInt(negative));
		}
		if((n/1000000)>0)
		{
			words=nToW(n/1000000)+"  Million  ";
			n %=1000000;
		}
		
		if((n/1000)>0)
		{
			words=nToW(n/1000)+"  Thousand  ";
			n %=1000;
		}
		if((n/100)>0)
		{
			words=nToW(n/100)+"  Hundred  ";
			n %=100;
		}
		if(n>0)
		{
			if(n<20)
			{
				words+=unit[n];
			}
			else
			{
				words+=ten[n/10];
			if(n%10>0)
			{
				words+="_"+unit[n%10];
			}
			}
		}
		return words;
	}
}