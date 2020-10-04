import java.util.*;

class Digit {

    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);
         
        System.out.println("enter a Number!");
        int n= sc.nextInt();

        int result=1;
        for(int i=n;i>=1;i--){
             result=result*i;
        }
        System.out.println("factorial of "+n+" is "+result);
        sc.close();

    }
}