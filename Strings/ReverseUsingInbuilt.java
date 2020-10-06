// Find length of String and Take User Input string?

import java.util.*;

class ReverseUsingInbuilt{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Strings is ");
        String str = sc.nextLine();

        String reverse=new StringBuilder(str).reverse().toString();
        System.out.println("Reversed String id (using inbuit function) "+reverse);
        sc.close();
        
    }
}