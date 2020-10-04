import java.util.*;

class FibonacciSeries {

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the limit of Fibonacci Series! ");
        int n=sc.nextInt();

        int a=0,b=1,temp;

        for(int i=0;i<=n;i++){

            System.out.print(" "+a);
            temp=a;
            a=b;
            b=temp+b;

        }
        sc.close();

    }
}