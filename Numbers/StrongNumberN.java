// How Many Strong Number u want to Print? 

// find Strong Number?

import java.util.*;

class StrongNumberN{

    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Number is ");
        int n=sc.nextInt();
        
        int count=0;
        System.out.println(" ArmStrong Number is ");
        for(int i=0;;i++){

            if(count==n)
              break;
            if(isArmstrong(i)){
                count++;
            System.out.print(i+" ");
        }


        }
        sc.close();
    }

    private static boolean isArmstrong(int num){
        int sum=0,temp=num;

        while(num>0){
            int rem=num%10;
            sum=sum+fact(rem);
            num=num/10;
        }
        if(temp==sum)
          return true;
        else 
          return false;
    }
    private static int fact(int num){
        int res=1;
        for(int i=num;i>=1;i--)
           res=res*i;
        
        return res;
    }
}