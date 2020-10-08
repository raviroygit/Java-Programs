// convert Char to number and Number to Char (ASCII)?

import java.util.*;

class EncodingNumberTocharAndCharToNum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter String U wnat to convert = ");
        String str=sc.nextLine();

        
        char a[]=new char[str.length()];

        for(int i=0;i<a.length;i++)
        {
            a[i]=str.charAt(i);
            System.out.print (" "+ a[i]+" ");
            if(a[i]>=65 && a[i]<=90 || a[i]>=97 && a[i]<=122){
                System.out.print (" "+(int) a[i]+" ");


                a[i]=0;
                
            }
            System.out.println (" ");
        }
        sc.close();
    }
}