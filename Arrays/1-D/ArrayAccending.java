// Find Frequency of Array Element?

import java.util.*;

class ArrayAccending{

     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Entert the Limit of Array Element! ");
        int n=sc.nextInt();

        int a[]=new int[n];

        System.out.println("Enter The Array Element! ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            
        }
       
        System.out.println("Array in Accending order! ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(a[j]>a[j+1])
                   {
                       int temp=a[j];
                       a[j]=a[j+1];
                       a[j+1]=temp;
                   }
            }

            
            }
            System.out.println("Array in Accending order! ");
            for(int i=0;i<n;i++)
            {
                System.out.print(a[i]+" ");
            }
        sc.close();
    }
}