package Series;
import java.util.*;
public class Fibonacci
{
	public void Display(int n)
	{
		int a=0;
		int b=1;
		int count=2;
		int c;

		System.out.println("The first "+n+" fibonacci terms are: ");
		System.out.println(a+" ");
		System.out.println(b+" ");

		while(count<n)
		{
			c=a+b;

			System.out.println(c+" ");
			count++;

			a=b;
			b=c;
		}
	}
}
