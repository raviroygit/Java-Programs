import java.util.*;

class SeprateOddEvenDigit {

    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);
         
        System.out.println("enter a Number!");
        int n= sc.nextInt();

        int even=0,odd=0;
        while(n>0){
            int rem=n%10;
            if(rem%2==0|| rem==0){
                even=(even*10)+rem;
            }
            else if(rem%2 !=0)
            {
              odd=(odd*10)+rem;
            }
            n=n/10;

        }
        System.out.print("After Separating Even and Odd number is  "+even+" "+odd);
        sc.close();

    }
}