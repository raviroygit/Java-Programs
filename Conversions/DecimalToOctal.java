// Convert Decimal to Binary.

import java.util.*;

class DecimalToOctal{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Decimal Number: ");
        int n=sc.nextInt();
        
        
        int octal=0;
        while(n>0){
            int rem=n%8;
            octal += rem;
            n=n/8;
        }
        System.out.println("Binary number: "+octal);
       

        sc.close();
    }
}