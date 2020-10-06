// Frequancy of String Charactar?

import java.util.*;

class FrequancyOfStringChar{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Strings is ");
        String str = sc.nextLine();

        int len=str.length();

        int a[]=new int[256];

        for(int i=0;i<len;i++){
            a[str.charAt(i)]++;
        }
        System.out.println("Frequancy of Charactar is ");
        for(int i=0;i<256;i++){
            if(a[i]>0)
             System.out.println((char) i+ ":"+a[i]);
        }

        sc.close();
        
    }
}