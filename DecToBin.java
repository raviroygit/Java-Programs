// Wap to convert decimal into binary

import java.util.*;

public class DecToBin
{
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" ");
		System.out.print("ENetr the Decimal Number= ");
		int n=sc.nextInt();
		
		int []flag= new int[20];
		int i=0;
		while(n>0){
			flag[i++]=n%2;
			n=n/2;
		}
		System.out.print("Binary\t number\t= \t");
		for( i=i-1;i>=0;i--)
		{
			System.out.print(" "+flag[i]);
		}
	    System.out.println(" ");
}
		
	}
		
