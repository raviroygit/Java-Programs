// Convert Binary To Decimal.

import java.util.*;

class BinaryToDecmail{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Binary Number: ");
        double n=sc.nextInt();
        
        
        int decimal=0, x=1;
        while(n>0){
            double rem=n%10;
            decimal +=rem*x;
             x=x*2;
            n=n/10;
        }
        System.out.println("Binary number: "+decimal);
       

        sc.close();
    }
}