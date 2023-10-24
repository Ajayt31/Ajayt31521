package MATRIX;

import java.util.*;

public class Display
{
	public void Accept(int A[][],int m,int n)
	{
		int i,j;
		Scanner ab=new Scanner(System.in);
		System.out.println("Enter the matrix variables: ");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.println("Enter the value of row "+(i+1)+" and column "+(j+1));
				A[i][j]=ab.nextInt();
			}
		}
	}

	public void Display(int A[][],int m,int n)
	{
		int i,j;
		System.out.println("The matrix elements are: ");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(A[i][j]+" ");
			}
			System.out.println();
		}
	}
}

