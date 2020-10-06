// find array Average using 1-d Array?

import java.util.*;

class ArraySearch {


    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Limit of Array! ");
        int n=sc.nextInt();
        
        int a[]=new int[n],i;
        boolean flag=false;
        int key=2;
        System.out.println("Enter the array element! and Enter Number U want Search! ");
        for( i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(a[i]==key){
                flag=true;
                System.out.println("Enter Element Present in this Array! ");
                     
                }
        } 
        if(flag=false)
        System.out.println("Enter Element not Present in this Array! ");

        sc.close();
    }
}