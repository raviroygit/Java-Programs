import java.util.*;

class IsPrime{

    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the Number!");
        int n=sc.nextInt();

        boolean flag=true;
        for(int i=2;i<=n/2;i++){
            if(n % i==0)
              flag=false;
        }
        if(flag==true)
        System.out.println("This is a Prime Number!");
        else
        System.out.println("Enter is not a Prime Number!");
        sc.close();

    }
    
}