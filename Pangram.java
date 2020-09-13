///  Check String is panagram or not(if present All Alphabet charcter is called panagram)
//Panagram String===== The quick brown fox jumps over the lazy dog
import java.util.*;

public class

{
	public static void main(String[] args)
	{
	String s;
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println(" Enter the String:  ");
	s=sc.nextLine();
	System.out.println("");
	
	s=s.replace(" ","");
	
	char a[]=s.toCharArray();
	int n=a.length;
	
	int a2[]=new int[26];
	int a3[]=new int[26];
	int i=0;
	
	// check ASCII code present in String or not
	while(i!=n)
	{
		if(a[i]>='A' && a[i]<='Z')
		{	
		int i2=a[i]-65;
		a2[i2]=1;
		}
		if(a[i]>='a' && a[i]<='z')
		{
			int i3=a[i]-97;
			a3[i3]=1;
		}
		++i;
		
	}
     i=0;
	while(i!=26)
	{
		if(a2[i]==1 || a3[i]==1)
		{
			++i;
		}

		else 
		{
			System.out.println("Not A Pangram !");
			System.exit(0);
		}
		++i;
		
	}
	System.out.println("This Is A PanGram! ");
	}
	
	
}