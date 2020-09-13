import java.util.*;
import java.util.Scanner;
import java.math.*;


public class Madd
{
	
	public static void main(String[] args)
	{
		
		int i,j,n;
		
		Scanner s= new Scanner(System.in);
		
		System.out.print("Enter the limit of matrix : ");
		n=s.nextInt();
		
		int [][] m1=new int [n][n];
		int [][] m2=new int [n][n];
		int [][] m3=new int [n][n];
		
		
		System.out.println("Enter the Matrix:! ");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				m1[i][j]=s.nextInt();
				
			}
		}
		
		System.out.println("Enter the Matrix2:! ");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				m2[i][j]=s.nextInt();

			}
		}
		
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				m3[i][j]= m1[i][j]+m2[i][j];
			}
		}
		
		
		System.out.println("Matrix 3 ! ");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(" "+m3[i][j]);
				
				
			}
			System.out.println();
		}
		
			
	}
}