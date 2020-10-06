// Find length of String and Take User Input string?

import java.util.*;

class ReverseString{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Strings is ");
        String str = sc.nextLine();

        int len=str.length();
           int l=len-1;
       
           char a[]=str.toCharArray();
           for(int i=0;i<len/2;i++){
               char temp=a[i];
               a[i]=a[l];
               a[l]=temp;
               l--;
           }
           str=new String(a);
           System.out.println("Reversed String is  "+str);

        sc.close();
        
    }
}