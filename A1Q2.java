import java.io.*;

class A1Q2 {
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter The String of Your Choice:- ");
		String s=(br.readLine());
		char a[]=new char[100];
		char b[]=new char[100];
		
		a=s.toCharArray();
		System.out.println("Choose Which Operation to Perform \n 1.Print Reverse Of The String \n 2.Print Length Of The String \n 3.Print Alternate Characters Of The String \n 4.Exit ");
		int ch=Integer.parseInt(br.readLine());
		switch(ch)
			{
				case 1:
					int len=0,i;
					try{

					for (i=0;a[i]!='\0';i++)
					
						len++;
					}

					catch(Exception e){}
					for(i=0;i<len;i++)
					{
						b[i]=a[len-i-1];
					}
					System.out.println("The reverse String is:   ");
					System.out.println(b);

					

					break;

				case 2: int length=0;
					try{
						for(i=0;a[i]!='\0';i++)
							length++;
					}
					catch(Exception e){}

					System.out.println("\n The Length of the String is:- " +length);
					break;

				case 3: try{
						for(i=0;a[i]!='\0';i+=2)
							System.out.println("Alternate Characters OF the String Are:- ");
							System.out.print(a[i]);
				}
				catch(Exception e){}

				System.out.println();
				break;

				case 4:System.exit(0);

				default:System.out.println("Invalid Choice Try Again !!");
			}
		}
	}

		


