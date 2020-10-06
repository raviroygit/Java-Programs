// find array Average using 1-d Array?

import java.util.*;

class ArrayAverage {


    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Limit of Array! ");
        int n=sc.nextInt();
        
        int sum=0;
        int a[]=new int[n];
        System.out.println("Enter the array element! ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            sum=sum+a[i];
        }
        int Average=sum/n;
        System.out.println("Average of array Elment is "+Average);
        sc.close();
    }
}