// ZigZag Spiral tree Traversal

import java.util.*;

public class ZiZag1
{
	public static void main(String args[])
	{
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		s=sc.nextLine();
		char a[]=s.toCharArray();
		roor=a[0];
	}
	
	public void spiral(root)
	{
		s1.push(root);
		while(s1.hasnode||s2.hasnode)
		{
			while(s1.hasnode())
			{
			p=s1.pop();
			System.out.println(""+p);
			if(p-leftchild)
				s2.push(p-leftchild);
			if(p-rightchild)
				s2.push(p-rightchild);
			}
			
			while(s2.hasnode)
			{
				p=s2.pop();
				System.out.println(""+p);
				if(p-rightchild)
					s1.push(p-rightchild);
				if(p-leftchild)
					s1.push(p-leftchild);
			}
		}
	}
}