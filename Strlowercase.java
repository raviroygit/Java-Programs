/// append string into stingBuffer




import java.util.*;

public class StringLowerCase
{
	public static void main(String[] args)
	{
		String s1,s2;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String! ");
		s1=sc.nextLine();
		
		
		s1=s1.toLowerCase();
		System.out.println("Before appending String: \t"+s1);
		
	}
}