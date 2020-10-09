// Find Sum of  in 2-D matrix.

import java.util.*;

class ColomSum{
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
                sum +=a[j][i];
                
                
            }
            System.out.println("Sum of Colom-"+(i+1)+" = "+sum);
            sum=0;
            
        }
          
         
      
        sc.close();
    }
}