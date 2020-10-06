// Find Frequency of Array Element?

import java.util.*;

class ArrayReverse{

     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Entert the Limit of Array Element! ");
        int n=sc.nextInt();

        int a[]=new int[n];

        System.out.println("Enter The Array Element! ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            
        }
       
        System.out.println("After Reversing Array Look Like! ");
        for(int i=n-1;i>=0;i--){
            
            System.out.print(a[i]+" ");
            }
              
        
  
        sc.close();
    }
}