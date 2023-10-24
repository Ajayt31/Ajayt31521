import java.util.*;

class A1Q3
{
	public static void main(String args[])
	{
		int r,m1,m2,m3,num;
		int i;
		double maxper;
		String n;

		Scanner ab=new Scanner(System.in);

		while(true)
		{
			System.out.print("Enter No Of Students: ");
			num=ab.nextInt();

			if (num>=0)
				break;
		}

		Construct ob[]=new Construct[num];
		System.out.println();

		for(i=0;i<num;i++)
		{
			do
			{
				System.out.print("Enter Roll Number Of Student " +(i+1)+" : ");
				r=ab.nextInt();
			}while(r<=0);

			System.out.println();
			ab.nextLine();

			System.out.print("Enter The Name Of The Student: ");
			n=ab.nextLine();

			System.out.println();

			do
			{
				System.out.print("Enter Marks Of Subject 1: ");
				m1=ab.nextInt();
			}while(m1<0 || m1>100);

			System.out.println();

			do
                        {
                                System.out.print("Enter Marks Of Subject 2:  ");
                                m2=ab.nextInt();
                        }while(m2<0 || m2>100);

                        System.out.println();

			do
                        {
                                System.out.print("Enter Marks Of Subject 3: ");
                                m3=ab.nextInt();
                        }while(m3<0 || m3>100);

                        System.out.println();

			
			ob[i]=new Construct(r,n,m1,m2,m3);

			System.out.print("Percentage is: "+ob[i].per);
			System.out.println();
		}



		maxper=0.0;
		for(i=0;i<num;i++)
		{
			if (ob[i].per > maxper)
				maxper=ob[i].per;
		}

		System.out.println("\n The Student Deatils With Max Percentage Are: ");

		for(i=0; i<num ; i++)
		{
			if(ob[i].per==maxper)
				ob[i].display();
		}
	}
}
