// Find Smallest Number in 2-D matrix.

import java.util.*;

class SmallestNum_2_DArray{
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
            
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++){
                if(a[i][j]<min)
                    min=a[i][j];
                
                
            }
            
        }
          
          System.out.println("Average of 2-D Array= "+min);
      
        sc.close();
    }
}