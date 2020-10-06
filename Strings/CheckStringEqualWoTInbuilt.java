// Check String Are Equal or Not Wintout Inbuilt Function?

import java.util.*;

class CheckStringEqualWoTInbuilt{
    public static void main(String args[]){

        Scanner sc=new Scanner (System.in);

        System.out.println("Enter First String ");
        String str1=sc.nextLine();

        System.out.println("Enter First String ");
        String str2=sc.nextLine();

        int len1=str1.length();
        int len2=str2.length();

        if(len1==len2){
            
        
            boolean flag=false;
        for(int i=0;i<len1;i++){
            if(str1.charAt(i)==str2.charAt(i))
               flag=true;
        }
        if(flag=true)
           System.out.println(" Both String Are Equals! ");
        else
        System.out.println(" String Not Equals! ");
           
    }
    else
      System.out.println(" String Not Equals! ");

    sc.close();
        
        
    }
}