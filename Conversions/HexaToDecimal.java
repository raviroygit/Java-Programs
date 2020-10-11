// Convert HexaDecimal To Decimal.

import java.util.*;

class HexaToDecimal{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter HexaDecimal number: ");
        String h=sc.nextLine();

        int dec=0;
        for(int i=h.length()-1;i>=0;i--){
              
            if(h.charAt(i)>=65 && h.charAt(i)<=70){
                dec=dec+((int)h.charAt(i)-55);
            }
            if(h.charAt(i)>=97 && h.charAt(i)<=102)
               dec=dec+(int) h.charAt(i)-87;
            else
               dec=dec+(int) h.charAt(i)-48;
        }
        System.out.println("Decimal Number= "+dec);
        sc.close();
    }
}