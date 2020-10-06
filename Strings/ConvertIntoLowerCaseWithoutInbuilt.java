// Convert String into Lower case Wintout Inbuilt Function?

import java.util.*;

class ConvertIntoLowerCaseWithoutInbuilt{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter String is ");
        String str=sc.nextLine();

        System.out.println("String Converted into Lower Case is "+convertLowercase(str));
        System.out.println("String Converted into Upper Case is "+convertUpperCase(str));

        sc.close();

    }
    private static String convertLowercase(String str){

        int len=str.length();
        char a[]=new char[len];
        a=str.toCharArray();
        for(int i=0;i<len;i++){
            if(a[i]>=65 && a[i]<=90)
                a[i]= (char) (a[i]+32);

        }
        str=new String(a);
        return str;

    }
    private static String convertUpperCase(String str){

        int len=str.length();
        char a[]=new char[len];
        a=str.toCharArray();
        for(int i=0;i<len;i++){
            if(a[i]>=97 && a[i]<=122)
                a[i]= (char) (a[i]-32);

        }
        str=new String(a);
        return str;

}
}