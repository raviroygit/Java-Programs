// Sum of n Number Using Recursion.

import java.util.*;

class ProductOfDigit{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number= : ");
        int n=sc.nextInt();
        
        
        System.out.print("Product of digit=  "+Product(n));
        sc.close();

        }
        
    static int product=1;
    private static int Product(int n){
       
        if(n==0)
           return product;
           product=product*(n%10);
          return Product(n/10);
    }
}