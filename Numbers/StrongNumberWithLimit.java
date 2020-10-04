// find Strong Number?

import java.util.*;

class StrongNumberWithLimit{

    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Number is ");
        int n=sc.nextInt();
        
        System.out.println(" ArmStrong Number is ");
        for(int i=0;i<=n;i++){
            if(isArmstrong(i))
            System.out.print(i+" ");

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