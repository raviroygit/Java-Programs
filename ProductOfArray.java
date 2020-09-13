/* Given array of integer,return a new array such that each element 
at index i of the new array is producd of all the numbers in the original array 
except the one at i. you can't use the division

time: O(n)
space: O(n)

i/p: [1,2,3,4,5]
o/p: [120,60,40,30,24]*/

import java.util.*;
public class ProductOfArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size Of Array: ");
        int n=sc.nextInt();
		System.out.println("Enter the Element of Array: ");
		int a1[]=new int[n];
		int i;
		for(i=0;i<n;i++)
			a1[i]=sc.nextInt();
		
		int p=1;
		for(i=0;i<n;i++)//find the product of all number
			p *=a1[i];
		
		System.out.println("===By Roy ===!Product of given Array: ");
		for(i=0;i<n;i++)
		{
			a1[i]=p/a1[i];
			System.out.print(" "+a1[i]+" ");
		}
		
		

	}
}

