import MATRIX.*;
import java.util.*;

class Package1
{
	public static void main(String args[])
	{
		int m,n,o,p;

		int A[][];
		int B[][];

		Scanner ab=new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		m=ab.nextInt();
		System.out.println();
		System.out.print("Enter the number of columns: ");
		n=ab.nextInt();
                System.out.println();

		A=new int[m][n];
		B=new int[m][n];

		Display ob=new Display();
		Display OB=new Display();
		Addition ob1=new Addition();
		Max ob2=new Max();
		OB.Accept(A,m,n);
		OB.Display(A,m,n);
		ob.Accept(B,m,n);
                ob.Display(B,m,n);
		System.out.println("Matrix addition is: ");
		ob1.Addition(A,B,m,n,);
		ob2.Maximum(A,m,n);
		ob2.Maximum(B,m,n);
	}
}


