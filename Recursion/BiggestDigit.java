// Sum of n Number Using Recursion.

import java.util.*;

class BiggestDigit{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number= : ");
        int n=sc.nextInt();
        
        
        System.out.print("Biggest Digit=  "+Big(n));
        sc.close();

        }
        
    static int max=Integer.MIN_VALUE;
    private static int Big(int n){
       
        int rem=n%10;
        if((rem>max)){
            max=rem;
        }
        if(n==0)
          return max;
            
          return Big(n/10);
    }
}