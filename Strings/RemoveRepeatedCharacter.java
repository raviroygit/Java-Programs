// Remove Repeated character but one letter is present(only uniques char printed)?


import java.util.*;

class RemoveRepeatedCharacter{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a String ");
        String str=sc.nextLine();

        int a[]=new int[256];

       
        for(int i=0;i<str.length();i++){
                 if(str.charAt(i)!=' ')
                    a[str.charAt(i)]++;
              }
        
       for(int i=0;i<str.length();i++){
 
        if(str.charAt(i)!=' '){
             if(a[str.charAt(i)]!=0){
                  System.out.print(str.charAt(i));
                   a[str.charAt(i)]=0;
             }
        }
        else
           System.out.print(str.charAt(i));
       }


      sc.close();
    }
}