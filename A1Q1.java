import java.io.*;

class A1Q1
{
	public static void main(String[] args)throws IOException
	{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Any Number: ");
		int num1= Integer.parseInt(br.readLine());
		System.out.println("Enter 2nd Number: ");
		int num2= Integer.parseInt(br.readLine());



		System.out.println("Choose One OF the Following Options:\n");
		System.out.println("1. Addition Of Numbers From "+num1+" To "+num2);
		System.out.println("2. Maximum Of Two Numbers  ");
		System.out.println("3. Multiplication Table Of "+num1+" And "+num2);
		int s=Integer.parseInt(br.readLine());

		switch(s)
		{
			case 1:
				int i,sum=0;
			if(num1<num2)
			{
					  for(i=num1;i<=num2;i++)
                                        {
                                                sum=sum+i;
                                        }
                                        System.out.println("Sum Of numbers from "+num1+" till "+num2+" is " +sum);
			}
			else
			{
				  for(i=num2;i<=num1;i++)
                                        {
                                                sum=sum+i;
                                        }
                                        System.out.println("Sum Of numbers from "+num2+" till "+num1+" is " +sum);
			}break;
			case 2:
				if (num1>num2)
				{ 
				System.out.println(num1+" is Greater Than " +num2);
				}
				else
				{
				System.out.println(num2+" is Greater Than " +num1);
				}
			break;
			case 3:
				System.out.println("\n Multiplication Table Of "+num1);
				for(i=1;i<=10;i++)
				{
				System.out.println(num1+ " * "  +i+ " is " +(num1*i));
				}
				System.out.println("\n Multiplication Table Of "+num2);
				for(i=1;i<=10;i++)
				{
				System.out.println(num2+ " * " +i+ " is " +(num2*i));
				}
				
		}
	}
}


