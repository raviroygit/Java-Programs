// Replace Character by Another character.

import java.util.*;

class ReplaceChar{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter String ");
        String str=sc.nextLine();
        System.out.println("Enter char U want to Replace ");
        String r=sc.nextLine();
        System.out.println("Enter new char = ");
        String n=sc.nextLine();

        str=str.replace(r, n);
        System.out.println("String After Replacement= "+str);
        sc.close();

    }
}