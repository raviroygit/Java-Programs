/// Lets Run the inbuild lireries and make operation on it


import java.util.*;

public class Inbuild
{
	
	public static void main(String[] args)
	{
		String s,s2;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("ENter the Original StringS: \t");
		s=sc.nextLine();
		
		System.out.println("Enter the 2nd String for Operation:\t");
		s2=sc.nextLine();
		
		StringBuffer sb=new StringBuffer(s);
		sb.append(s2);
		
		System.out.println(" "+sb+" ");
		
		System.out.println(" ");
		System.out.println(" Now CONTAINS");
	
		System.out.println(" "+s.contains(s2));
		
		System.out.println(" = ");
		System.out.println(" "+s.equals(s2));
		
		//System.out.println(" charAt ");
        // System.out.println(" uSE IF cHAR sTRING"));

       		System.out.println("EndsWith ");
			System.out.println(" "+s.endsWith("y"));
		System.out.println(" IndexOf ");
         System.out.println(" "+s2.indexOf("o"));	

      System.out.println("  ");
      System.out.println("toLowerCAse  ");
       System.out.println(" "+s2.toLowerCase());	  
	   
	   System.out.println("  ");
	   System.out.println(" isEnpty ");
	   System.out.println("  "+s.isEmpty());
	   
	   System.out.println("  ");
	   System.out.println(" subString use when CharArray String");
       //System.out.println("  "+sub.String("y"));	
     
	   System.out.println("  ");
	   System.out.println(" Replace ");
	   System.out.println("  "+s2.replace("roy","Ravi"));
     	   
	   System.out.println("  ");
	   System.out.println(" Delete ");
	   //System.out.println("  "+s2.delete("r"));
	   
	   
	   System.out.println("  ");
	   System.out.println(" getByteCode and HashCode ");
	   System.out.println("  "+s2.getBytes()+"   "+s.hashCode());
	   
	   System.out.println("  ");
	   System.out.println(" Replace All ");
	   System.out.println("  "+s.replaceAll(s,s2));
	   
	   
	   
	   
	   
	}
}