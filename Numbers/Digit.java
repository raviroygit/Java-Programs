import java.util.*;

class Digit {

    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);
         
        System.out.println("enter a Number!");
        int n= sc.nextInt();

        System.out.println("Digit of a Number is ");
        while(n>0){
            int rem=n%10;
            System.out.print(rem+" ");
            n=n/10;

        }
        sc.close();

    }
}