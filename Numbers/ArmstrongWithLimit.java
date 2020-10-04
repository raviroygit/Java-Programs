//ArmStrong Number with a Limitation?

import java.util.*;

class ArmstrongWithLimit {

    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);
         
        System.out.println("enter a Number!");
        int n= sc.nextInt();

        
        System.out.println("ArmStrong Number is ");
         for(int i=1;i<=n;i++){
             
              if(isArmstrong(i))
                 System.out.print(i+" ");
         }
         sc.close();

    }

    private static boolean isArmstrong(int num){
        int temp=num;
        int result=0;
        int len=findLength(num);
        while(num>0){
            int rem=num%10;
            result=(int) (result+Math.pow(rem, len));
            num=num/10;
        }
        if(result==temp)
           return true;
        else
          return false;
    }
    private static int findLength(int num){
        int len=0;
        while(num>0){
            len++;
            num=num/10;
        }
        return len;
    }
    
}