package Series;
import java.util.*;
public class Prime
{
	int isPrime(int x)
	{
		int count=0;
		int i;

		for(i=2;i<=x/2;i++)
		{
			if(x%i==0)
				count++;
		}
		if(count==0)
			return(1);
		else
			return(0);
	}

	public void Print(int n)
	{
		int i=1;
		int c=0;
		System.out.println("The first "+n+" prime numbers are: ");
		while(c<n)
		{
			if(isPrime(i)==1)
			{
				System.out.println(i+" ");
				c++;
			}
			i++;
		}
	}
}

