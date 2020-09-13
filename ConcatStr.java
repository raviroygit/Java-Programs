// how to concat String in java

import java.util.*;

public class ConcatStr
{

   public static void main(String[]args)
   {
	   String s1,s2;
	   
	   
	   Scanner s=new Scanner(System.in);
	   
	   System.out.println("Enter the 1st String! ");
	   s1=s.nextLine();
	   System.out.println("Enter the 2nd String! ");
	   s2=s.nextLine();
	   
	   
	   System.out.println(s1.concat(s2));
   }

}