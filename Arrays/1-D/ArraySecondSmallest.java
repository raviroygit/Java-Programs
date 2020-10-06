// Find Array First and Second Largest Element?

import java.util.*;

class ArraySecondSmallest{

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Array limit! ");
        int n=sc.nextInt();

        int a[]=new int[n];
        int Smallest=Integer.MAX_VALUE,SecondSmallest=Integer.MAX_VALUE;

        System.out.println("Enter the Array Element ! ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
              if(Smallest>=a[i]){
                  SecondSmallest=Smallest;
                  Smallest=a[i];
              }
              else if(SecondSmallest>=a[i]){
                  SecondSmallest=a[i];
              }
            }
            System.out.println("First Smallest Element in Array is "+Smallest);
            System.out.println("Second Smallest Element in Array is "+SecondSmallest);
            sc.close();
        }
       

    }
