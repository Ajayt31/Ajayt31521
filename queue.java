package DS;
import java.util.*;
public class queue
{
	int ar[];
	int num;
	int front;
	int rear;

	public queue(int num)
	{
		this.num=num;
		ar=new int[num];

		front=-1;
		rear=-1;
	}
	public void Add(int x)
	{
		if(rear==num-1)
			System.out.println("Queue overflow: ");
		else
		{
			rear++;
			ar[rear]=x;
		}
	}
	public void Delete()
	{
		if(front==rear)
			System.out.print("Queue Empty");
		else
		{
			front++;
			System.out.print("Deleted element: "+ar[front]);
		}
	}
	public void Display()
	{
		if(front==rear)
			System.out.println("Queue Empty");
		else
		{
			int a;
			for(a=rear;a>=0;a--)
			{
				System.out.print(ar[a]+" ");
			}
		}
	}
}

