import java.util.Scanner;

public class Fib
{
	
	public static void main(String[] args)
	{
		int a=0,b=1,i;
		int fib=0;
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		System.out.println("Fibonacci Sesies  \n"+0);
		for(i=0;i<n;i++)
		{
			fib=a+b;
			System.out.print("\t "+fib);
			a=b;
		    b=fib;
			
		}
		
		
		
		
		
	}
}