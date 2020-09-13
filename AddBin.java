// Add binary number

import java.util.*;

public class AddBin
{
	public static void main(final String args[]) {
		int b1, b2, c = 0;
		final Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Two biary number: ");
		b1 = sc.nextInt();
		b2 = sc.nextInt();
		// int n=b1.length;
		int i = 0;
		final int sum[] = new int[16];
	   while(b1!=0 || b2!=0)
	   {
		   sum[i++]=((b1%10+b2%10+c)%2);
		   c=((b1%10+b2%10+c)/2);
		   b1=b1/10;
		   b2=b2/10;
		   
	   }
	   
	   if(c!=0)
		   sum[i++]=c;
	   System.out.println("Sum of two Binary number: ");
	   while(i>=0)
	   {
		System.out.print(sum[i--]);   
	   }
	   System.out.println();
	}
	
}