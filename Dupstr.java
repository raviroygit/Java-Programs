import java.util.*;
public class Dupstr
{
public static void main(String[] args)
{
	String x="SILLYSPIDER";
	char c[]=x.toCharArray();
	int size=c.length;
	Map<Character,Integer> map =new LinkedHashMap<>();
	int i=0;
	while(i!=size)
	{
		if(map.containsKey(c[i])==false)
		{
		   map.put(c[i],1);
		
		}
		else
		{
			int oldval = map.get(c[i]);
			int newval = oldval + 1;
			map.put(c[i],newval);
			
		}
		++i;
	}
	Set<Map.Entry<Character,Integer>> lhmap = map.entrySet();
	for(Map.Entry<Character,Integer> data : lhmap)
	{
		if(data.getValue()>1)
		{
			System.out.print(data.getKey());
			System.out.println(data.getValue());
		}
		
	}
}

}