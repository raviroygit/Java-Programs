// Sum of n Number Using Recursion.

import java.util.*;

class SumOfNnumbers{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int n=sc.nextInt();
        
        
        System.out.println("Sum of N number=  "+sum(n));
        sc.close();

    }
    private static int sum(int n){
        if(n==1)
           return 1;
        return(n+sum(n-1));
    }
}