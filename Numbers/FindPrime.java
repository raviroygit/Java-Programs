import java.util.*;

class FindPrime{

    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the Number!");
        int n=sc.nextInt();

        int count=0,i=2;

        System.out.println("Prime Number is ");
        while(count<=n){
            if(isPrime(i)){
               count++;
               System.out.print(i+" ");
            }
            i++;
        }
        sc.close();
        
        
    }
    private static boolean isPrime (int num){
        for(int i=2;i<=num/2;i++){
            if(num % i==0)
              return false;
        }
        return true;
    }
}