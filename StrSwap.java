// sWAP THE GIVEN sTRING
//failed
import java.util.*;

public class StrSwap
{
	public static void main(String[] args)
	{
		int i,j,len;
		char temp=0;
		String s;
		
		Scanner a=new Scanner(System.in);
		
		System.out.println("Enter the String !");
		s=a.nextLine();
		
		len=s.length();
		
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				char[] str=s.toCharArray();
		        temp=str[i];
		        str[i]=str[j];
		        str[j]=temp;
		       
			}
		
	    }
		System.out.println(String.valueOf(temp));
		
		
	}
}