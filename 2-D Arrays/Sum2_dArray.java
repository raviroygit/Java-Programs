// Sum of2-D Array.

import java.util.*;

class Sum2_DArray{
    public static void main(String args[]){
       
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter The Limit of Row and Colom(n X m):  ");
        int n=sc.nextInt();
        int m=sc.nextInt();

        System.out.println("Enter 2-D 1st Array/Matrix Element: ");
        int a2[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++){
                a2[i][j]=sc.nextInt();
                
            }
        
        }
        System.out.println("Enter 2-D 2nd Array/Matrix Element: ");
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
                
            }
        
        }

        System.out.println("Sum of Array=  ");
        int sum[][]=new int[n][m];
        System.out.println(" 2-D Array=  ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++){
                sum[i][j]=a[i][j]+a2[i][j];
                System.out.print(" "+sum[i][j]);
            }
            System.out.println("");
        }
        sc.close();
    }
}