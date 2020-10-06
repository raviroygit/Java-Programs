// Find length of String and Take User Input string?

import java.util.*;

class StringUserInputLength{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Strings is ");
        String str = sc.nextLine();

        int len=str.length();

        System.out.println("Length of String is "+len);

        sc.close();
        
    }
}