// Tokenizer is to break sentence into Word.
//String=  Hey this program for replace sepecific character  
//OutPut:->>>>>>>    
// Hey      
// this     
// program  
// for      
// replace  
// sepecific
// character

import java.util.*;

class Tokenizer{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter String = ");
        String str=sc.nextLine();
        
        StringTokenizer st=new StringTokenizer(str);
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
       
       
        sc.close();

    }
}