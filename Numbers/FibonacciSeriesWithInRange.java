import java.util.*;

class FibonacciSeriesWithInRange {

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Begining Limit! ");
        int n1=sc.nextInt();

        System.out.println("Enter the Ending Limit! ");
        int n2=sc.nextInt();

        int a=0,b=1,temp;

        System.out.print("Fibonacci Series is  ");
        while(a<=n2){

            
            temp=a;
            a=b;
            b=temp+b;
            if(a<=n2 && a>=n1)
               System.out.print(" "+a);

        }
        sc.close();

    }
}