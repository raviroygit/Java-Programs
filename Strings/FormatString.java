// format string?

// Find length of String and Take User Input string?

import java.util.*;

class FormatString{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Strings is ");
        String str1 = sc.nextLine();
        String str2=String.format("%s",str1);
        String str3=String.format("%2.2f",121.3234);
        String str4=String.format("%f",12.332);
        String str5=String.format("%1.12f",12.21343);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
        sc.close();
        
    }
}