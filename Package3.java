import DS.*;
import java.util.*;
class Package3
{
	public static void main(String args[])
	{
		String str;
		int n,num;
		int choice;

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of stack: ");
		n=sc.nextInt();
		System.out.println("Enter the size of queue: ");
		num=sc.nextInt();
		stack ob=new stack(n);
		queue ob1=new queue(num);
		while(true)
		{
			System.out.println();
			System.out.println("\nEnter choice:\n1.To reverse string\n2.To add element in queue\n3.To delete the element\n4.To display\n5.To quit:\n ");
			choice =sc.nextInt();
			sc.nextLine();
			switch(choice)
			{
				case 1:System.out.print("Enter your String: ");
				       str=sc.nextLine();
				       int i;
				       for(i=0;i<str.length();i++)
				       {
					       char ch=str.charAt(i);
					       ob.Push(ch);
				       }
				       System.out.println("The reversed string is: ");
				       while(ob.top>=0)
					       ob.Pop();
				       break;
				case 2:int x;
				       System.out.println("Enter the number: ");
				       x=sc.nextInt();
				       ob1.Add(x);
				       break;
				case 3:ob1.Delete();
				       break;
				case 4:ob1.Display();
				       break;
				case 5:System.exit(0);
				       break;
			}
		}
	}
}

