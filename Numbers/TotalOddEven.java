// Find Toatal Odd And Even Digit in a Number?

import java.util.*;

class Digit {

    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);
         
        System.out.println("enter a Number!");
        int n= sc.nextInt();

       int even=0,odd=0;
        while(n>0){
            int rem=n%10;
           if(rem%2==0)
               even++;
            else
               odd++;
            n=n/10;

        }
        System.out.println("Total Even Digit is "+even);
        System.out.println("Toatal odd Digit is  "+odd);
        sc.close();

    }
}