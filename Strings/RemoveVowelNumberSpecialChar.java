// Remove All Special Character using ReplaceAll?

import  java.util.*;

public class RemoveVowelNumberSpecialChar {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);

         System.out.println("Enter String ");
         String str=sc.nextLine();
         
         String special=str.replaceAll("[a-z,A-Z,0-9]", "");
        
         str = str.replaceAll("[" + special + "]", "");
         
         

         System.out.println("After Removing Special Chararcter = "+str);
         
         System.out.println("Removed Special Character  = "+special);
         sc.close();
        
    }
}
