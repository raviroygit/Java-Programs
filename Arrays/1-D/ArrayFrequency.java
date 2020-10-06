// Find Frequency of Array Element?

import java.util.*;

class ArrayFrequency{

     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Entert the Limit of Array Element! ");
        int n=sc.nextInt();

        int a[]=new int[n];

        int max=Integer.MIN_VALUE;
        System.out.println("Enter The Array Element! ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(a[i]>=max)
               max=a[i];
        }
        int len=max;
        int count[]=new int[len+1];
        for( int i=0;i<n;i++){
           count[a[i]]++;
           
        }
        
        System.out.print(" \n ");
        for(int i=0;i<count.length;i++){
            if(count[i]>0)
              System.out.println(i+":"+count[i]+" times");
        }
        sc.close();
    }
}