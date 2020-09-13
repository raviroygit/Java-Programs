public class Replace
{
	
	
	
   public static void main(String[] args)
   {
       StringBuffer s= new StringBuffer("ROYroy");
       s.replace(0,2,"ROe");
	   System.out.println("Afetr replacing string is"+s);
	   s.delete(0,1);
	   System.out.println(s);
   
   }
	}

