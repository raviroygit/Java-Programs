// Find length of String and Take User Input string?


import java.util.*;

class StringSortUsingInbuilt{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Strings  ");
        String str = sc.nextLine();

        char a[]=str.toCharArray();

        Arrays.sort(a);
        System.out.println("String aftersorting  "+new String(a).trim());

        sc.close();
        
    }
}