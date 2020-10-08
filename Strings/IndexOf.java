// Convert number(Ascii) to Char ?


import java.util.*;

class indexOf{
public static void main(String args[]){

    Scanner sc=new Scanner(System.in);

   System.out.println("Enter Sentence = ");
    String str=sc.nextLine();
    System.out.println("Enter String U want to check = ");
    String n=sc.nextLine();
    int Index=str.indexOf(n);
    System.out.println("String Converted= "+Index);
    sc.close();



}
}