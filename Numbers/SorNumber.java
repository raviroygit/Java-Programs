import java.util.*;

class SorNumber {

    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);
         
        System.out.println("enter a Number!");
        int n= sc.nextInt();

       int a[]=new int[10];
       int result=0;
        while(n>0){
            int rem=n%10;
            a[rem]++;
            n=n/10;

        }
        System.out.println("before sorting number is ");
        for(int i=1;i<=9;i++)
           System.out.print(" "+a[i]);
        for(int i=0;i<=9;i++){
            for(int j=1;j<=a[i];j++){
                result=(result*10)+i;
            }
        }
        System.out.println(" \nAfter Sorting Number is  "+result);
        sc.close();

    }
}