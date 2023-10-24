import Series.*;
import java.util.*;

class Package2
{
	public static void main(String args[])
	{
		int n;
		int choice;

		Scanner sc=new Scanner(System.in);

		Prime ob=new Prime();
		Fibonacci ob1=new Fibonacci();
		Squares ob2=new Squares();

		while(true)
		{
			System.out.print("\nEnter your choice:\n1.For displaying prime numbers\n2.For displaying Fibonacci numbers\n3.For displaying squares \n4.exit\n");
			choice=sc.nextInt();
			System.out.println();
			switch(choice)
			{
				case 1:System.out.println("Enter the value of n: ");
				       n=sc.nextInt();
				       System.out.println();
				       ob.Print(n);
				       break;

				case 2:System.out.println("Enter the value of n: ");
				       n=sc.nextInt();
				       ob1.Display(n);
				       break;

				case 3:System.out.println("Enter the value of n: ");
				       n=sc.nextInt();
				       System.out.println();
				       ob2.Display(n);
				       break;

				case 4:System.exit(0);
			}
		}
	}
}

