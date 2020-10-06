// Find Array Largest Number?


import java.util.*;

class ArraySum{

    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter Limit of a Array!");
    int n=sc.nextInt();

    int a[]=new int[n];
    int max=0;
    System.out.println("Enter the Array Element! ");
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();

        if(a[i]>=max){
            max=a[i];
        }

    }                                               
    System.out.println("Largest Array Element is "+max);
    sc.close();        
    
         
    }
   

}


