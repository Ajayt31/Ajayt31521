package MATRIX;

import java.util.*;

public class Addition
{
	public void Addition(int A[][],int B[][],int m,int n)
	{
		int S=0;
		int i,j;

		if(A.length !=B.length)
			System.out.println("Matrix Addition not possible without same size matrices");

		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print((A[i][j]+B[i][j])+" ");

			}
			System.out.println();
		}
	}
}

