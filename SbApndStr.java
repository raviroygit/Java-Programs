/// append string into stingBuffer




import java.util.*;

public class SbApndStr
{
	public static void main(String[] args)
	{
		String s1,s2;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String! ");
		s1=sc.nextLine();
		System.out.println("Enter the String! ");
		s2=sc.nextLine();

		StringBuffer sb=new StringBuffer(s1);
		System.out.println("Before appending String: \t"+sb);
		
		sb.append(s2);
		System.out.println("after appending String: \t"+sb);
		
	}
}