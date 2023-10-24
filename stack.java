package DS;
import java.util.*;
public class stack
{
	char ar[];
	int n;
	public int top;
	public stack(int n)
	{
		this.n=n;
		this.top=-1;
		ar=new char[n];
	}
	public void Push(char ch)
	{
		if(top==n-1)
			System.out.println("Stack overflow");
		else
		{
			top++;
			ar[top]=ch;
		}
	}
	public void Pop()
	{
		if(top==-1)
			System.out.println("Stack underflow");
		else
		{
			System.out.print(ar[top]);
			top--;
		}
	}
	public void Peek()
	{
		if(top==-1)
			System.out.println("Stack Empty");
		else
		{
			System.out.print(ar[top]);
		}
	}
}

