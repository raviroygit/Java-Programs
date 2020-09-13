// Sparse Matrix

import java.util.*;

public class SparseMatrix
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,j,m,n;
		System.out.println("Enter the size(m*n) of matrix ");
		m=sc.nextInt();
		n=sc.nextInt();
		
		System.out.println("Enter the Matrices Element: ");
		int sparseMatrix[][]=new int[m][n];
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
				sparseMatrix[i][j]=sc.nextInt();
			System.out.println("");
		}
		
		int size=0;
		
		
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				if(sparseMatrix[i][j]!=0)
				{
					size++;
				}
			}
			
		}
		
		// Creating new Matrix
		int compactMartrix[][]=new int[3][size];
		int k=0;
		for(i=0;i<m;i++)
		{
		for(j=0;j<n;j++)
			{
				if(sparseMatrix[i][j]!=0)
				{
					compactMartrix[0][k]=i;
					compactMartrix[1][k]=j;
					compactMartrix[2][k]=sparseMatrix[i][j];
					k++;
				}
			}
		}
		
			
		System.out.println("SparseMatrix: ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<size;j++)
			{
				System.out.print(" "+compactMartrix[i][j]+" ");
			}
		   System.out.println("");
		}
	}
}