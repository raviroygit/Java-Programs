// Pythagearn of triplete with any limit n natural numbers

import java.util.*;

public class Pythagearn
{
	public static void main(String args[])
	{
		int j=2,i=1,a,b,c=0,l;
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter the value of n: ");
		l=sc.nextInt();
		
		while(c<l)
		{
		for(i=1;i<j;++i)
		{
			a=j*j-i*i;
			b=2*i*j;
			c=i*i+j*j;
			
			/*if(c>l)// using this condition get result below the  number
				break;*/
			System.out.print(" "+a+" "+b+" "+c+"\t");// without if we get result combination utpto n number
		}
		j++;
		
		}
		
		
	}
}