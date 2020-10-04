import java.util.*;

class Armstrong {

    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);
         
        System.out.println("enter a Number!");
        int n= sc.nextInt();

        int result=0;
        int temp=n;
         while(n>0){
             int rem=n%10;
             result=(rem*rem*rem)+result;
             n=n/10;
         }
         if(temp==result)
            System.out.println("It is a Armstrong Number!");
        else
            System.out.println("It is Not a Armstrong Number!");
       
 
            sc.close();
    }
    
}