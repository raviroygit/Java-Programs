
// Find a Digit from a number?

import java.util.*;


class FindDigit {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a nUmber!");
        int n=sc.nextInt();

        
        System.out.println("Enter Digit U want to Find?");
        int digit=sc.nextInt();
        while(n>0){

            int rem=n%10;
            
            if(rem==digit){

                System.out.println(digit+"found in this Number ");
            }
            
            n=n/10;
           
        }
        sc.close();
    }
}