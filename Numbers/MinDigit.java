import java.util.*;

class MinDigit {

    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);
         
        System.out.println("enter a Number!");
        int n= sc.nextInt();

        int min=Integer.MAX_VALUE;
        
        while(n>0){
            int rem=n%10;
            if(rem<=min)
                min=rem;
            n=n/10;

        }
        System.out.println("Min Digit is  "+min);
        sc.close();

    }
}