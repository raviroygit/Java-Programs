// wap to check which position haing 0 or 1

import java.util.*;


public class Check01
{

    public static void main(String[] args )
	{
		 int i=0,j,n,p;
		  Scanner sc=new Scanner(System.in);
		   System.out.println("Enter Position U Want to Check:");
		  p=sc.nextInt();
           System.out.println("Enter trhe decimal number= ");
        
         n=sc.nextInt();

		 int bin[] = new int[20];
		 if(n>=p)
		 {
			  
		while(n>0)
		 {
			 bin[i]=n%2;
			 n=n/2;
			 i++;
		 }
		 
		 for(i=(i-1);i>=0;i--)
		 {
			 System.out.print( "  "+bin[i]);

		 }
		 
		 
		  
		 }
		 else
			 //System.out.println("Please Enter A valid Number: ");
		 
		 System.out.println("");
		
		 System.out.print(" Found at  "+p+" Position = ");
		 
		  if(bin[p-1]==1)
		  {
			 System.out.print(" 1 ");
		  }
		  else
			  System.out.println("0");
		 
		
		 
	}


}