//// multiply or Square of a Number using bitwise oprator

import java.util.*;

public class MulBitwise
{
	
	public static void main(String[] args)
	{
		int n;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("ENter the 1st number :! ");
		n=sc.nextInt();
		
		System.out.println("ENter the 2nd number :! ");
		int n1=sc.nextInt();
		//int m=2;
		//n1=n1-m;
		int mul=n<<n1;
		
		System.out.println("Multiplication of number using Bitwise Operator:! "+mul);
		
		
	}
}