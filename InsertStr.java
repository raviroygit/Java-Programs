// insert a	 element in String


import java.util.*;

public class InsertA
{
	
	public static void main(String[] args)
	{
		int i,p,n;
		
		
		Scanner sc=new Scanner(System.in);
		String s;
		System.out.println("Enter the String= ");
		s=sc.nextLine();
		
		char a[]=s.toCharArray();
		n=a.length;
		

		
		char temp;
		int len=a.length;
		
		System.out.println("Enter the Position Where want to insert Element= ");
		p=sc.nextInt();
		
		System.out.println("Enter the Element = " );
		char e=sc.next().charAt(0);
		
			/*System.out.println();
		System.out.println("Deleted Element= "+a[len-1]);*/
		temp=a[len-1];
		for(i=len-1;i>p-1;i--)
		{
			
			a[i]=a[i-1];
			
		}
		a[p-1]=e;
		
		System.out.print("After INsertion of element =  ");
		for(i=0;i<n;i++)
		{
			System.out.print("  "+String.valueOf(a[i])+"");
		}
		System.out.print(" "+temp);
		
		
		
	}
}