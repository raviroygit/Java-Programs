// Convert String Upper Case To Lower case and Lower Case to Upper Case?

import java.util.*;

class ConvertStringUpperLowerCase{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a Strin p");
        String str=sc.nextLine();

        System.out.println("String converted into Upper Case is "+str.toUpperCase());
        System.out.println("String Converted into Lower Case is "+str.toLowerCase());

        sc.close();
    }
}