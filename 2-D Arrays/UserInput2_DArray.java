// Get User Input in 2-D Array.

import java.util.*;

class UserInput2_DArray{
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

        System.out.println(" 2-D Array=  ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++){
                System.out.print(" "+a[i][j]);
                
            }
            System.out.println("");
        }
        sc.close();
    }
}