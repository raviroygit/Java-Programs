// WAP for convert Alternative Lower and Upper case in String?

import java.util.*;

class StringAlternativeUpperLowerCase{

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter String ");
        String str=sc.nextLine();

        System.out.println("After Converting String look like is "+convert(str));

        sc.close();

    }

    private static String convert(String str){

        int len=str.length();
        char a[]=new char[len];
        a=str.toCharArray();

        for(int i=0;i<len;i++){
            if(i%2==0){
            if(a[i]>=65 && a[i]<=90)
               a[i]=(char) (a[i]+32);
            else {
                if(a[i]>=97 && a[i]<=122)
               a[i]=(char) (a[i]-32);
            }
        }
        }
        str=new String(a);
        return str;
    }
}