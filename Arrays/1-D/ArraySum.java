// Find Array Sum?


import java.util.*;

class ArraySum{

    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter Limit of a Array!");
    int n=sc.nextInt();

    int a[]=new int[n];
    System.out.println("Enter the Array Element! ");
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();

    }                                                       
    int sum=0;
    for(int i=0;i<n;i++){
         sum=a[i]+sum;
    }
    System.out.println("Sum of 1-D array is "+sum);
    sc.close();

}


}