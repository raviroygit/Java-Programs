// Split the String using Tokenizer

import java.util.*;

public class Tokenizer
{
	public static void main(String[] args)
	{
		String s1,s2;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String! ");
		s1=sc.nextLine();
		System.out.println("Enter the String! ");
		s2=sc.nextLine();
		
		StringTokenizer str1= new StringTokenizer(s1);
		
		while(str1.hasMoreTokens())
		{
			System.out.println(str1.nextToken());
		}
		
		StringTokenizer str2= new StringTokenizer(s2," * ");
		
		while(str2.hasMoreTokens())
		{
			System.out.println(str2.nextToken());
		}
	}
	
}