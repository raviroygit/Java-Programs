// Swap using Bitwise number

import java.util.*;

public class SwapUbitwise
{
	public static void main(String args[])
	{
		int m,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number m and n: ");
		m=sc.nextInt();
		n=sc.nextInt();
		
		m=m^n;
		n=n^m;
		m=m^n;
		System.out.println("After Swapping number: ");
		System.out.println("!st number: "+m);
		System.out.println("2nd number: "+n);
	}
}