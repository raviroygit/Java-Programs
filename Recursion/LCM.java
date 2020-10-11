// Sum of n Number Using Recursion.

import java.util.*;

class LCM{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the first & second Number: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        

        System.out.println("LCMof N number=  "+lcm(a,b));
        sc.close();

    }
    static int i=1;
    private static int lcm(int a,int b){
        int multiple=a*(i++);
        if(multiple%a==0 && multiple%b==0)
            return multiple;
        return lcm(a,b);
    }
}