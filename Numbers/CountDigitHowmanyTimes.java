///find how many time repeat digit in a Number

import java.util.*;

class Digit {

    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);
         
        System.out.println("enter a Number!");
        int n= sc.nextInt();
        System.out.println("enter a Number Digit U want to check! ");
        int digit=sc.nextInt();

        int count=0;
        while(n>0){
            int rem=n%10;
              if(rem==digit)
              {
                  count++;
              
              }
            n=n/10;

        }
        System.out.println(digit+" find "+count+" times");
        sc.close();

    }
}