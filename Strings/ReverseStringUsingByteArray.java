// Reverse Array Using Byte Arrays in String?

import java.util.*;

class ReverseStringUsingByteArray{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a String ");
        String str=sc.nextLine();
        
        // store each character ascii in the string to a byte array
        byte[] temp=str.getBytes();

        //create empty array
        byte[] result=new byte[str.length()];

        // reverse array
        for(int i=0;i<str.length();i++){
           
            result[i]=temp[str.length()-i-1];

        }
        str=new String(result);
        System.out.println("Reversed Array is "+str);
        sc.close();
    }
}