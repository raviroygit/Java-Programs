// Reverse Array Using String Builder Arrays in String?

import java.util.*;

class ReverseStringUsingStringBuilder{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a String ");
        String str=sc.nextLine();
        
        // create Empty String Builder
          StringBuilder sb=new StringBuilder();

          //push strng into String Builder
             sb.append(str);
             
             //Now Reversed String 
             sb.reverse();

             //now convert into StringBuilder to String
        str=new String(sb);

        System.out.println("Reversed String is "+str);
        
       
        sc.close();
    }
}