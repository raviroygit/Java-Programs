import java.util.*;

class  FactorialRecursion{

    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);
         
        System.out.println("enter a Number!");
        int n= sc.nextInt();

        int result=factorial(n);
        System.out.println("Factorial Using Recursion is "+result);
       sc.close();

    }
    private static int factorial(int num){
        if(num==1)
          return 1;
        
        return (num*factorial(num-1));
           
    }
}