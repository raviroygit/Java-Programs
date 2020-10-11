// Sum of n Number Using Recursion.

import java.util.*;

class GCD{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the first & second Number: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        
        System.out.println("Sum of N number=  "+gcd(a,b));
        sc.close();

    }
    private static int gcd(int a,int b){
        if(b==0)
           return a;
        return gcd(b ,a % b);
    }
}