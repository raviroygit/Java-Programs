// Find Sum of Diagonal  in 2-D matrix.

import java.util.*;

class DiagonalSum{
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
        int sum=0;
   
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++){
                if(i==j)
                  sum =sum+a[i][j];
            }
        }
          
        System.out.println("Diagonal Sum = "+sum);
        
      
        sc.close();
    }
}