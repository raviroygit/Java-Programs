import java.util.*;

class CountDigit {

    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);
         
        System.out.println("enter a Number!");
        int n= sc.nextInt();

        int a[]=new int[10];
       
        while(n>0){
            int rem=n%10;
            a[rem]++;
            n=n/10;

        }
    
        

        for(int i=0;i<=9;i++){
            if(a[i]>0)
            System.out.println(i+":"+a[i]+" times");
        }
        sc.close();
    }
}