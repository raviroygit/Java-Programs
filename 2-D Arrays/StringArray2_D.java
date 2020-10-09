// Get 2-D String Array Input.

import java.util.*;

class StringArray2_D{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enetr Limit of Row and Array(n X m)= ");
        int n=sc.nextInt();
        int m=sc.nextInt();
         
        System.out.println("Enetr String as Array Element:=  ");
        String str[][]=new String[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                str[i][j]=sc.nextLine();
                
            }
        }
        System.out.println("2-D String Array=  ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(str[i][j]+" ");
            }
            System.out.println("");
        }
        sc.close();

    }
}