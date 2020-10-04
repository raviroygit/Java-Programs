//Find total Digit in a number ?

import java.util.*;

class TotalDigit {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A number = ");
        int n=sc.nextInt();

         int len=0;
        while(n>0){
              len=len+1;
              n=n/10;

        }
        System.out.println("Total Digit in This Number is "+len);
        sc.close();
    }
}