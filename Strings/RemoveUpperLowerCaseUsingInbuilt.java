// Remove Upper case Using Inbuilt fuction?
import java.util.*;


public class RemoveUpperLowerCaseUsingInbuilt {
    public static void main(String aegs[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter String ");
        String str=sc.nextLine();
          String str1=str;
        str=str.replaceAll("[A-Z]", "");

        System.out.println("After Removing Upper CAse Letter String is.\n "+str);

        str1=str1.replaceAll("[a-z]", "");

        System.out.println("After Removing Lower CAse Letter String is.\n "+str1);

        sc.close();
    }
}
