// Replace Character by Another character.
// Trim use for trim Space from first and last of String.

import java.util.*;

class Trim{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter String before Trim= ");
        String str=sc.nextLine();
        System.out.println("Length before Trim= "+str.length());
        str=str.trim();
        System.out.println("After Trim String is= "+str.length()+"  length and String is"+str);
       
       
        sc.close();

    }
}