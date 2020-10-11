// Convert Decimal To HexaDecimal.

import java.util.*;


class DecimalToHexadecimal{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Decimal Number: ");
        int n=sc.nextInt();

        String hex="";
        while(n>0){
            int rem=n%16;
            if(rem>=0 && rem<=9)
               hex=rem+hex;
            else 
                hex=hex+(char) (rem+55);
            n=n/16;
        }
        System.out.println("HexaDecimal Number is :  "+hex);
        sc.close();
       
    }
    
}