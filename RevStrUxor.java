// Reverse String Using Xor

import java.util.*;

public class RevStrUxor
{
    public static void main(String args[])
	{
	    String s;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Ente a string: ");
		s=sc.nextLine();
		
		char a[]=s.toCharArray();
		int len=a.length;
		int i=0;
		while(i<len)
			
		{
			a[i]^=a[len-1];
			a[len-1]^=a[i];
			a[i]^=a[len-1];
			
			i++;
			len--;
			
		}
		System.out.println(String.valueOf(a));
	
	}
}