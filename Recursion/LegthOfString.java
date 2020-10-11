// Sum of n Number Using Recursion.

import java.util.*;

class LegthOfString{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter String= : ");
        String n=sc.nextLine();
        
        
        System.out.print("Length of String=  "+Length(n));
        sc.close();

        }
        
        static int len=0;
    private static int Length(String str){
       
          int length=str.length();
          if(length<=0)
               return len;
        len++;
          return Length(str.substring(0, length-1));
    }
}