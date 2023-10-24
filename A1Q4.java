import java.util.*;

class A1Q4
{
	public static void main(String args[])
	{
		int ino,p,qty,num;
		String n;
		int i,j,temp,temp1;
		int sum;

		Scanner ab= new Scanner(System.in);

		do
		{
			System.out.print("Enter Number Of Items: ");
			num=ab.nextInt();
		}while(num<0);

		item ob[]=new item[num];

		for(i=0;i<num;i++)
		{
			do
			{
				System.out.print("Enter the Item code: ");
				ino=ab.nextInt();
			}while(ino<0);

			System.out.println();

			ab.nextLine();                      
                        
			System.out.print("Enter the Item Name: ");
                        n=ab.nextLine();
			
			do
                        {
                                System.out.print("Enter Price: ");
                                p=ab.nextInt();
                        }while(p<0);

                        System.out.println();

                       do
		       {
			       System.out.print("Enter Quantity: ");
			       qty=ab.nextInt();
		       }while(qty<0);

		       System.out.println();

		       ob[i]= new item(ino,n,p,qty);

		       System.out.println("The Total of the Item is: "+ob[i].tot);

		}

		sum = 0;

		System.out.println("The Details Of All items: ");

		for(i=0;i<num;i++)
		{
			ob[i].display();
			System.out.println();
			sum=sum+ob[i].tot;
		}

		System.out.println("The total cost of the items is:"+sum);

		for(i=0;i<num;i++)
		{
			for(j=0;j<num-1;j++)
			{
				if(ob[j].price>ob[j+1].price)
				{
					temp=ob[j].price;
					ob[j].price=ob[j+1].price;
					ob[j+1].price=temp;

					temp1=ob[j].item_code;
					ob[j].item_code=ob[j+1].item_code;
					ob[j+1].item_code=temp1;
				}
			}
		}

		System.out.print("Sorted List According To Price Is:\n ");

		for(i=0;i<num;i++)
		{
			System.out.println("Item No: "+ob[i].item_code+"\t Price: "+ob[i].price);
		}
	}
}
