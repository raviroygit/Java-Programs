//not understandable dry run


import java.util.*;

class StringRepeatesChar{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
          
       
        System.out.println("Enter Strings is ");
         String str=sc.nextLine();

         int n=str.length();
         int []a=new int[256];
         for(int i=0;i<n;i++){
             if(str.charAt(i)==' ')
                continue;
            a[str.charAt(i)]++;
            //System.out.println(" "+a[i]);
         }
        
         for(int i=65;i<=90;i++){
             a[i]=a[i]+a[i+32];
             a[i+32]=0;
             System.out.print(" "+a[i]);
         }

         for(int i=0;i<256;i++){
             if(a[i]>1)
                 System.out.println((char) i+":"+a[i]);
         }
       
        sc.close();
        
    }
}