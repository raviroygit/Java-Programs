// Convert number(Ascii) to Char ?


import java.util.*;

class ByteArrayToString{
public static void main(String args[]){

    Scanner sc=new Scanner(System.in);

    byte[]a={65,66};
    System.out.println("Byte array = "+a);
    String str=new String(a);

    System.out.println("String Converted= "+str);
    sc.close();



}
}