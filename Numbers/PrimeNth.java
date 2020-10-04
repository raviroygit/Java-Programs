//find largest Prime number in given limt?

import java.util.*;

class PrimeNth {

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the limit of a Prime Numeber ");
        int n=sc.nextInt();

        for(int i=n;i>=1;i--){
            if(isPrime(i)){
                System.out.println("Largest Prime Number is "+i);
                break;
            }
         
        }
        sc.close();
        
    }
    private static boolean isPrime(int num){
        for (int i=2;i<=num/2;i++)
        {
            if(num%i==0)
              return false;
        }
        return true;
    }
}