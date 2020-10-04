import java.util.*;

class GreatestNumber{

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter First and Second Number! ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();

        if(n1>n2){
            System.out.println("First Number "+n1+" is Greatest Number among Two number!");
        }
        else
          System.out.println("Second Number "+n2+" is a Greatest Number!");

          sc.close();
    }
}