/// Count vovels consonants and special characters 

import java.util.*;

public class VoCoSp
{
	public static void main(String[] args)
	{
		String s;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println(" Enter the input String");
		s=sc.nextLine();
		
		
		char a[]=s.toCharArray();
		int n=a.length;
		
		int Vowels=0;
		int Consonent=0;
		int SpecialChar=0;
		int i=0;
		
		while(i!=n)
		{
			
			if(a[i]>='A' && a[i]<='Z'||a[i]>='a' && a[i]<='z')
			{
				
				
				if(a[i]=='A'||a[i]=='a'||a[i]=='E'||a[i]=='e'||a[i]=='I'||a[i]=='i'||a[i]=='O'||a[i]=='o'||a[i]=='U'||a[i]=='u')
					{
						++Vowels;
					}
				else
					{
						++Consonent;
					}
			
			}
			
			else
			{
				++SpecialChar;
			}
			i++;
			}
			
		
		
		System.out.println("Total Vowels=  "+Vowels);
		System.out.println("Total Consonent= "+Consonent);
		System.out.println("Total SpecialChar= "+SpecialChar);
		
		
		
		
	}
}