// Concatenate String ?

import java.util.*;

class CopyString{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a String ");
        String str1=sc.nextLine();

        // System.out.println("Enter a String ");
        // String str2=sc.nextLine();
        
        String str2 = new String(str1);
        String str3=str2;
        System.out.println("Reversed String is "+ str1);
        System.out.println("Reversed String is "+ str2);
        System.out.println("Reversed String is "+ str3);
        sc.close();
    }
}