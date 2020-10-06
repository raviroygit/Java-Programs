// Find Array Smallest Element ?

import java.util.*;

class ArraySmallest{

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the limit of Array! ");
        int n=sc.nextInt();

        int a[]=new int[n];
        int min=Integer.MAX_VALUE;
        System.out.println("Enter the array Elment ");
        for(int i=0;i<n;i++){
           a[i]=sc.nextInt();
           if(a[i]<=min){
               min=a[i];
           }
           
        }
        System.out.println("Smmallest Array Element is "+min);
           sc.close();
    }
}