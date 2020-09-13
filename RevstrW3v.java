///Reverse string without using any temporary variable
//Failed 
import java.util.*;

public class RevstrW3v
{
	public static void main(String[] args)
	{
		String s;
		int n;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print(" ENter the String! \t");
		s=sc.nextLine();
		
		n=s.length();
		
		 String st[]=s.toCharArray();
		
		//int i=0,j=n-1;
		
		
		System.out.println("Revesed String= "+reverse(st,0,n-1));
	}
	
	static String reverse(char str,int i,int j)
	{
		while(i<j)
		{
		   str[i]^=str[j];
		   str[j]^=str[i];
		   str[i]^=str[j];
		   
		   i++;
		   j--;
		   
		}
		return String.valueOf(str);
	}

	
}