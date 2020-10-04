import java.util.*;

class Digit {

    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);
         
        System.out.println("enter a Number!");
        int n= sc.nextInt();

       int temp=0,sum=0;
        while(n>0){
            int rem=n%10;
            sum = sum +rem;
            temp=sum;
            n=n/10;

        }
        System.out.println("Sum of Digit =  "+temp);
        sc.close();

    }
}