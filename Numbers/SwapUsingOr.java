//Swap a Number using Exclusive OR(^)?

//Swap Using Ternary Operator?

//Find total Digit in a number ?

import java.util.*;

class SwapUsingOr {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first and Second Number! ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();

        n1=n1^n2;
        n2=n1^n2;
        n1=n1^n2;

          
        System.out.println("Total Digit in This Number is "+n1+" and "+n2);
        sc.close();
    }
}
