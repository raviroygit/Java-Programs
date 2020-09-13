import java.util.Scanner;
import java.util.*;

public class Fact
{
	public static void main(String[] args)
	{
		int i,fact=1;
		
		Scanner s=new Scanner(System.in);
		System.out.print(" Enter the value of n: ");
		int n=s.nextInt();
		
		System.out.println("Factorial of "+n+" =");
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
			
		}
		System.out.println(" "+fact);
	}
}