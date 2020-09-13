// Reverse a sing Using stack with inbuild function

import java.util.*;

public class RevStr1
{
	public static void main(String[] args)
	{
		String s;
		int n,i,top=0,len;
         Stack<Character> stack= new Stack<>();
		
		Scanner sc=new Scanner(System.in);
	
	     System.out.print("Enter the stering U want to reverse :!\t ");	
          s=sc.nextLine();
		  
		len=s.length();
		// input sing
		
		  
         for( i=0;i<len;i++)
		 {
			 stack.push(s.charAt(i));
		 }
		 System.out.print("Reverse String! ");
		 
		 while(!stack.empty())
			 System.out.print(stack.pop());
	}
	
}