
// Find a Digit from a number?

import java.util.*;


class FindDuplicateDigit {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a nUmber!");
        int n=sc.nextInt();

        int a[]=new int[10];
        while(n>0){

            int rem=n%10;
            a[rem]++;
            n=n/10;
           
        }
        for(int i=0;i<=9;i++){
            if(a[i]>1)
            System.out.println(i+" is Duplicate number Present "+a[i]+" times");
        }
        sc.close();
    }
}