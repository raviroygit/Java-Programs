// conver binary to decimal

import java.util.*;

public class BinToDec

{
	public static void main(String args[])
	{
		int n,k=0,d=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Binary number= ");
		n=sc.nextInt();
		
		while(true){
			
			if(n==0)
			{
				break;
			}
			else
			{
				int r=n%10;
				 d +=r*Math.pow(2,k);
				n=n/10;
				k++;
			}	
		}
		System.out.println("Decimal number= "+d);
		
		
	   
	   
	   
		
		
	}
}