import java.util.*;

class LargestDigit {

    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);
         
        System.out.println("enter a Number!");
        int n= sc.nextInt();

       int rem,L=0,s=0;
        while(n>0){
             rem=n%10;
             
            if(rem>=L){
                s=L;
                L=rem;

            }
            else if(rem>=s)
               s=rem;
            
            n=n/10;

        }
        System.out.println("Second largest Digit  =  "+s);
        System.out.println("Largest Digit  =  "+L);
        sc.close();

    }
}