// Convert Char to Its AScII USING codePointAt inbuilt function.

import java.util.*;

public class CharToAscii {
   
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a String: ");
        String str=sc.nextLine();

        System.out.println("After converted: ");
        for(int i=0;i<str.length();i++){
              System.out.println(str.codePointAt(i));}
              sc.close();
    }
}
