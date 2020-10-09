import java.util.*;

class StringBuilderVsStringBufferVsString{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter String = ");
        String str=sc.nextLine();
        System.out.println("Enter String for StingBuilder = ");
        String str1=sc.nextLine();
        System.out.println("Enter String for StringBuffer = ");
        String str2=sc.nextLine();
        StringBuilder str4=new StringBuilder(str1);
        
        StringBuffer str3=new StringBuffer(str2);
        
        change(str);
        change(str4);
        change(str3);
        
        System.out.println("Enter String = "+str);
        System.out.println("Enter String = "+str4);
        System.out.println("Enter String = "+str3);
        sc.close();

    }
    private static void change(String str){
        str=str+"xyz";
    }
    private static void change(StringBuilder str){
        str=str.append("xyz");
    }
    private static void change(StringBuffer str){
        str=str.append("xyz");
    }
}