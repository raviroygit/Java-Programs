// Find Sum of All Number in String ?

import java.util.*;

class FindSumOfAllNumberInString{

public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter String ");
    String str=sc.nextLine();

    int sum=0;
    for(int i=0;i<str.length();i++){
        if(str.charAt(i)>='0' && str.charAt(i)<='9')
            sum=sum+(str.charAt(i)-48);
    }
    System.out.println("Sum of All number from String = "+sum);
    sc.close();

}

}
