// Spiral Matrix
// Time complexity O(mn)

import java.util.*;
public class SpiralMatrix
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Size(m*n) of 2D matrix: ");
		int m=sc.nextInt();
		int n=sc.nextInt();
		System.out.println("Enter the Matrix Element: ");
		int a[][]=new int[m][n];
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
			  a[i][j]=sc.nextInt();
		
		int i,top=0,left=0,down=m,right=n;
		
		System.out.println("Spiral matrix: ");
		while(top<=down && left<=right)
		{
			// first Row 
			for(i=left;i<right;i++)
				System.out.print(" "+a[top][i]+" ");
			top++;
			
			// last column
			for(i=top;i<down;i++)
				System.out.print(" "+a[i][right-1]+" ");
			right--;
			
			// last row
			if(top<down)
			{
				for(i=right-1;i>=left;--i)
					System.out.print(" "+a[down-1][i]+" ");
				down--;
			}
			// first column
			if(left<right)
			{
				for(i=down-1;i>=top;--i)
					System.out.print(" "+a[i][left]+" ");
			}
			left++;
		}
		
		
	}
}