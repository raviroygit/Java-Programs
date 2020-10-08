// Concatenate String ?

import java.util.*;

class ConcateString{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a String ");
        String str1=sc.nextLine();

        System.out.println("Enter a String ");
        String str2=sc.nextLine();
        
        String str3=str1+str2;

        System.out.println("Reversed String is "+str3);

  
        System.out.println("Reversed String is "+ str1.concat(str2));
       

        StringBuilder sb=new StringBuilder();
        sb.append(str1);
        sb.append(str2);
        String str4=sb.toString();
        System.out.println("Reversed String is "+ str4);
        sc.close();
    }
}