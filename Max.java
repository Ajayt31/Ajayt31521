package MATRIX;

import java.util.*;

public class Max
{
	public void Maximum(int A[][],int m,int n)
	{
		int i,j;
		int Max=0;

		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				if(A[i][j]>Max)
					Max=A[i][j];
			}
		}
		System.out.println("The maximum element of the matrix is: "+Max);
	}
}

