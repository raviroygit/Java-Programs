// duplicte string with how many time repeated using Map

import java.util.*;

public class DuplicateStr
{
	public static void main(String[] args)
	{
		String s;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the string: \t");
		s=sc.nextLine();
		
		char str[]=s.toCharArray();
		
		Map<Character,Integer> map= new LinkedHashMap<>();
		int i=0,n;
		n=s.length();
		while(i!=n)
		{
			if(map.containsKey(str[i])==false)
			{
				map.put(str[i],1);
				
			}
			else
			{
				int oldval=map.get(str[i]);
				int newval= oldval+1;
				map.put(str[i],newval);
			}
			i++;
			
			
		}
		Set<Map.Entry<Character,Integer>> lhmap= map.entrySet();
		for(Map.Entry<Character,Integer> data:lhmap)
		{
			if(data.getValue()>1)
			{
				System.out.print(data.getKey());
				System.out.println(data.getValue());
			}
		}
		
		
	}
}