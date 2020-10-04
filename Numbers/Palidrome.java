// Check Enter Number is a palidrome or Not?

import java.util.*;

class ReverseN{

    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the Number!");
        int n=sc.nextInt();

        int rev=0,rem;

        int temp=n;
        while(n>0){
           rem=n%10;
           rev=(rev*10)+rem;
           n=n/10;
        }
        if(temp==rev)
        System.out.println("It is a Palidrome Number! ");
        else
        System.out.println("Enter Number is not a palidrome! ");
        sc.close();
        
        
    }
   
}