// Convert Decimal to Binary.

import java.util.*;

class DecimalToBinary{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Decimal Number: ");
        int n=sc.nextInt();
        
        
        String str="";
        while(n>0){
            int rem=n%2;
            str=str+rem;
            n=n/2;
        }
        System.out.println("Binary number: "+str);
       

        sc.close();
    }
}