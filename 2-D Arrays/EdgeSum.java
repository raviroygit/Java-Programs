// Find Sum of MajorDiagonal  in 2-D matrix.

import java.util.*;

class EdgeSum{
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
        System.out.println("Edge Elements: ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++){
                if(i==0 || i==m-1 || j==0 || j==m-1){
                System.out.print(" "+a[i][j]);
                 sum=sum+a[i][j];}
                 else
                   System.out.println("  ");

            }
            System.out.println("");

        }
        System.out.println("EdgeSum =  "+sum);

        sc.close();
    }
}