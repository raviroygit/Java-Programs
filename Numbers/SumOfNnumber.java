import java.util.*;

class SumOfNnumber{
   public static void main(String[] args){

    Scanner sc= new Scanner(System.in);

    System.out.println("Enter Number U want to sum! =");
    int n=sc.nextInt();

    int temp=0,sum=0;
    for(int i=0;i<=n;i++){
      
          sum = sum+i;
          temp=sum;
    }
     System.out.println("Sum of n number = " +temp);
     sc.close();
   }
}