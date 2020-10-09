// GAverage of 2-D array.

import java.util.*;

class Average_Of_2_dArray{
    public static void main(String args[]){
       
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter The Limit of Row and Colom(n X m):  ");
        int n=sc.nextInt();
        int m=sc.nextInt();

        System.out.println("Enter 2-D Array/Matrix Element: ");
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
                
            }
            System.out.println("");
        }
        int sum=0,total_element=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++){
                sum=sum+a[i][j];
                total_element++;
                
            }
            
        }
          int Average=sum/total_element;
          System.out.println("Average of 2-D Array= "+Average);
      
        sc.close();
    }
}