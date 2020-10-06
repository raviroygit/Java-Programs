// Find Repeated/Duplicate Char in String?

import java.util.*;

class StringDuplicate{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter String ");
        String str=sc.nextLine();

        char a[]=new char[256];
        int len=str.length();

        for(int i=0;i<len;i++){
           if(str.charAt(i)==' ')
              continue;
            
            a[str.charAt(i)]++;
        }
        for(int i=0;i<256;i++){
          if(a[i]>1)
          System.out.println((char) (i)+" "+a[i]);
        }
       sc.close();
    }
}