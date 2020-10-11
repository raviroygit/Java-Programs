// Sum of n Number Using Recursion.

import java.util.*;

class Fibnacci{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the limit of Fibonacci Series= : ");
        int n=sc.nextInt();
        
        
        System.out.print("Fibnacci Series=  ");
        for(int i=1;i<=n;i++){
            System.out.print("  "+fib(i));

        }
        sc.close();

    }
    private static int fib(int n){
        if(n==0)
           return 0;
        if(n==1 || n==2)
          return n-1;
        return (fib(n-1)+fib(n-2));
    }
}