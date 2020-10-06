// Find Frequency of Array Element?

import java.util.*;

class  ArrayMostOccuring{

     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Entert the Limit of Array Element! ");
        int n=sc.nextInt();

        int a[]=new int[n];

        int max=Integer.MIN_VALUE;
        System.out.println("Enter The Array Element! ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(a[i]>=max)
               max=a[i];
        }
        int len=max;
        int count[]=new int[len+1];
        for( int i=0;i<n;i++){
           count[a[i]]++;
           
        }
        
        int most=0,mostvalue=0;
        for(int i=0;i<count.length;i++){
            if(count[a[i]]>=most){
                most=count[a[i]];
                mostvalue=a[i];
            }
              
        }
        System.out.println("Most Occurning number "+mostvalue+" Occurs "+most+" times");
        sc.close();
    }
}