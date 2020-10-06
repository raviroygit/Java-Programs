// Find Array First and Second Largest Element?

import java.util.*;

class ArraySecondLargest{

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Array limit! ");
        int n=sc.nextInt();

        int a[]=new int[n];
        int max=Integer.MIN_VALUE,Second=Integer.MIN_VALUE;

        System.out.println("Enter the Array Element ! ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(a[i]>=max){
                Second=max;
                max=a[i];
            }
            else if(Second>=a[i]){
                Second=a[i];
            }
        }
        System.out.println("First Largest Element in Array is "+max);
        System.out.println("Second Largest Element in Array is "+Second);
        sc.close();

    }
}