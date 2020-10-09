// Check String isEmpty ?

import java.io.UnsupportedEncodingException;
import java.util.*;

class EncodeNuberToChar{
public static void main(String args[]){

    Scanner sc=new Scanner(System.in);

    //System.out.println("Enter number That U want to convert in Character = ");
    //String str1=sc.nextLine();
    
    //byte []a=str1.getBytes();
    byte[]a={65,66};
    System.out.println(a);
    String str2="";
    try{
        str2=new String(a,"US-ASCII");
    }
    catch(UnsupportedEncodingException e){
        e.printStackTrace();
    }
    System.out.println(str2);



}
}