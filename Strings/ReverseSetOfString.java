// Reverse Set of String ?

import java.util.*;

class ReverseSetOfString{
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // System.out.println("Enter String ");
        // String str=sc.nextLine();

           String str=" India is my country";
        int wordCount=word(str);

        String a[]=new String[wordCount];

        String temp="";
        str=str+" ";

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                   temp=temp+str.charAt(i);
            }
            if(str.charAt(i)==' ')
                 a[--wordCount]=temp;
                 temp="";
        }

        String answer="";
        for(String s : a){
            answer = answer + s +  " ";
        }
        System.out.println(answer);
        sc.close();

    }

    private static int word(String str){
        int count=0;
          for(int i=0;i<str.length();i++){
              if(str.charAt(i)==' '){
                    ++count;
              }
              
          }
          return count+1;
    }
}