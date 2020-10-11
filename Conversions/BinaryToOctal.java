// Convert HexaDecimal To Decimal.

import java.util.*;

class BinaryToOctal{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Binary Number: ");
         int b=sc.nextInt();
        int dec=0;
          int x=1;
        while(b>0){
            int rem=b%10;
            dec=dec+(rem*x);
            x=x*2;
            b=b/10;
        }
        int octal=0;
        while(dec>0){
            int rem=dec%8;
            octal=octal+rem;
            dec=dec/8;

        }
        System.out.println("Octal Number=  "+octal);

        sc.close();
    }
}