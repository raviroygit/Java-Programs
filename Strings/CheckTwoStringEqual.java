// Check Wether Two String Are Equal or not in both Sensetive or inSensetive?

import java.util.*;

class  CheckTwoStringEqual {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter First String ");
        String str1=sc.nextLine();
        System.out.println("Enter First String ");
        String str2=sc.nextLine();

        if(str1.equals(str2))
           System.out.println("After checking String Equal (In Case Sensetive)");
        else if(str1.equalsIgnoreCase(str2))
            System.out.println("String Equal(In Case Insensetive)");
        else
        System.out.println("String is Not Equal");

        sc.close();

    }
}