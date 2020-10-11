// convert Octal to Decimal.

import java.util.*;

public class OctalToDecimal {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Octal Number: ");
        int n=sc.nextInt();

        int decimal=0,x=1;
        while(n>0){
            int rem=n%10;
            decimal  +=rem*x;
            x=x*8;
            n /=10;
        }
        System.out.println("Decimal Number: "+decimal);
        sc.close();

    }
}
