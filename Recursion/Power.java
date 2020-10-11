// Sum of n Number Using Recursion.

import java.util.*;

class Power{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int n=sc.nextInt();
        System.out.println("Enter the Power of Number: ");
        int pow=sc.nextInt();
        

        System.out.println("Power of a number=  "+power(n,pow));
        sc.close();

    }
    static int i=1;
    private static int power(int n,int pow){
        if(pow==0)
           return 1;
       
        return  (n* power(n,pow-1));
    }
}