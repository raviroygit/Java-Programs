// convert Octal to Decimal.

import java.util.*;

public class OctalToBinary {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Octal Number: ");
        int o=sc.nextInt();

        int dec=0,x=1;
        while(o>0){
            int rem=o%10;
            dec=dec+(rem*x);
            x=x*8;
            o=o/10;
 
        }
    
        int bin=0;
        x=1;
       while(dec>0){
           int rem=dec%2;
           bin=bin+(rem*x);
           x=x*2;
           dec=dec/2;

       }
      
        System.out.println("Decimal Number: "+bin);
        sc.close();

    }
}
