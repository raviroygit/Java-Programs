// Sum of digit Using Recursion.

import java.util.*;

class DigitSum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number= : ");
        int n=sc.nextInt();
        
        
        System.out.print("Sum of Digit=  "+Sum(n));
        sc.close();

        }
        
    static int sum=0;
    private static int Sum(int n){
        sum=sum+(n%10);
        if(n==0)
           return sum;
          return Sum(n/10);
    }
}