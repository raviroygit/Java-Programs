// Match String Using Quantifier inbuilt keyword.

import java.util.*;

class StringMatches{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter String = ");
        String str=sc.nextLine();
        
       System.out.println(str.matches("abc(.*)"));
       System.out.println(str.matches("(abcde)"));
       System.out.println(str.matches("(.*)de"));
       System.out.println(str.matches("(.*)c(.*)"));
       System.out.println(str.matches("(.*)ce(.*)"));
       System.out.println(str.matches("abc"));
       System.out.println(str.matches(""));
       System.out.println(str.matches("(.*)"));
       System.out.println(str.matches("(.*)b(.*)e"));
        sc.close();

    }
}