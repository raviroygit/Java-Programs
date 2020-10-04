import java.util.*;

class SortWithOutDST {

    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);
         
        System.out.println("enter a Number!");
        int n= sc.nextInt();

       int  temp=n;

        int result=0;
        for(int i=0;i<=9;i++){
        
            n=temp;
          while(n>0){
            int rem=n%10;
            if(rem==i)
            {
                result=(result*10)+rem;
            }
            n=n/10;

        }
        
    }
    System.out.println("After Sorting Number is  "+result);
        sc.close();

    }
}