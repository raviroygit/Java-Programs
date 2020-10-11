//Factorial Using Recursion.

import java.util.*;

class Factorial{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int n=sc.nextInt();
        
        
        System.out.println("Sum of N number=  "+factorial(n));
     sc.close();
    }
    private static int factorial(int n){
        if(n==1)
           return 1;
        return(n*factorial(n-1));
    }
}