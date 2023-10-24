import java.io.*;

class person
{
	String name;
	String add;


	person(String na,String a)
	{
		name=na;
		add=a;
	}
}

class student extends person
{
	String course[]=new String[5];
	String grade[]=new String[5];

	int n;


	student(String na,String a)
	{
		super(na,a);
	}


void addc()throws IOException
{
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 System.out.println("\nEnter the no of courses:");
	 int q=Integer.parseInt(br.readLine());
	 n=q;
	 for(int i=0;i<n;i++)
	 {
		 int flag=0;
		 System.out.println("\nEnter the course name:");
		 course[i]=br.readLine();
		 if(i>0)
		 {
			 int j=0;
			 while(j<i)
			 {
				 if(course[i].equals(course[j]))
				 {
  					System.out.println("\nCourse already exist");
  					i--;
  					flag=1;
  					break;

 				}
 				else
 				{
 					j++;
 				}
 			}
 
 		}
		if(flag==0)
 		{
 			 System.out.println("\nEnter the Grade:");
 			 grade[i]=br.readLine();

 		}
       }
}


void display()throws IOException
{
	System.out.println("Name:"+name);
	System.out.println("Address:"+add);
	System.out.println("coures are:");
	for(int i=0;i<n;i++)
	{
 		System.out.println(course[i]+"\t"+grade[i]);

  
 	}


}

}


class teacher extends person
{
	String courset[]=new String[5];
	int nu;

	teacher(String na,String a)
	{
		super(na,a);
	}

	void addco() throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nEnter the no of courses:");
		int q=Integer.parseInt(br.readLine());
		nu=q;


		for(int i=0;i<nu;i++)
		{
		System.out.println("\nEnter course Name:");
		courset[i]=br.readLine();

		if(i>0)
		{
			int j=0;
			while(j<i)
			{
				if(courset[i].equals(courset[j]))
				{

					System.out.println("\nCourse already exist !!");
					i--;
					break;
				}
				else
				{
					j++;
				}

			}
		}


	}

}

void delete(teacher obj2[],int p)throws IOException
{

	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int flag=0,flag1=0;
	for(int k=0;k<p;k++)
	{
		System.out.println("\nEnter teacher name:");
		String s=br.readLine();
		String r=obj2[k].name;
		if(r.equals(s))
		{
			flag=1;
			System.out.println("\nEnter course name to be deleted:");
			String I=br.readLine();


			for(int i=0;i<obj2[k].nu;i++)
			{
				if(I.equals(obj2[k].courset[i]))
				{
					System.out.println("\nCourse deleted:"+obj2[k].courset[i]);
					obj2[k].courset[i]="";
					flag1=1;

				}
			}


		}

	}

	if(flag1==0)
	{
		System.out.println("\nCourse doesnt exist !!");

	}
	if(flag==0)
	{
		System.out.println("\nTeacher doesnt exist !!");

	}
}

void display()throws IOException
{
 	System.out.println("Name:"+name);
  	System.out.println("Address:"+add);
 	System.out.println("coures are:");
 	for(int i=0;i<nu;i++)
 	{
		if(courset[i]=="")
	 	{
	 		i++;
	 	}
	 	else
	 	{
	 		System.out.println(courset[i]);
	 		i++;
	 	}
 	}
	System.out.println("\n*************");
}

void add(teacher obj2[],int p)throws IOException
{
	int I;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("\nEnter Teacher name:");
	String s=br.readLine();
	int flag=0;
	for(int k=0;k<p;k++)
	{
  		String r=obj2[k].name;
  		if(r.equals(s))
  		{
   			flag=1;
   			System.out.println("\nEnter the course name to be added:");
   			I=Integer.parseInt(br.readLine());
   			int a=obj2[k].nu;
   			obj2[k].nu=obj2[k].nu+1;
   			for(int i=a;i<obj2[k].nu;i++)
   			{
    				System.out.println("\nEnter course name:");
    				obj2[k].courset[i]=br.readLine();
    				if(i>0)
    				{
    					int j=0;
    					while(j<i)
    					{
    						if(obj2[k].courset[i].equals(obj2[k].courset[j]))
    						{
      							System.out.println("\nCourse already exist");
      							i--;
      							break;
    						}
    						else
    						{
	    						j++;
    						}
    					}
    				}
   			}
  		}

	}
	if(flag==0)
	{
 		System.out.println("\nTeacher doesnt exist");
	}
}

}

class q1
{
 	public static void main(String[] args )throws IOException
 	{
 		int p,q,i,c,r;
 		String names="",adds="";
 		student []obj=new student[10];
 		teacher []obj1=new teacher[10];

 		teacher t=new teacher(names,adds);
 		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 		do
 		{
   			System.out.println("\nMenu\n1.student\n2.teacher\n3.exit\n\nenter your choice:");
   			c=Integer.parseInt(br.readLine());
   			switch(c)
   			{
     				case 1:System.out.println("\nEnter the no of students:");
	    			p=Integer.parseInt(br.readLine());
	    			for(i=0;i<p;i++)
	    			{
 	    				System.out.println("\nEnter the Name of Student:");
	    				names=br.readLine();
            				System.out.println("\nEnter the Address of Student");
	     				adds=br.readLine();
            				obj[i]=new student(names,adds);
	    				obj[i].addc();
	    			}
	     			System.out.println("\nStudent details are");
             			System.out.println("\n********");
             			for(i=0;i<p;i++)
	     			{
	      				obj[i].display();
	       				System.out.println("/********/");
               
	     			}
	     			break;
	     
     case 2: System.out.println("\nEnter the Number of teachers:");
	     p=Integer.parseInt(br.readLine());
	     for( i=0;i<p;i++)
	     {
	     	System.out.println("\nEnter the Name of teacher:");
            	names=br.readLine();
            	System.out.println("\nEnter the Address of teacher:");
             	adds=br.readLine();
            	obj1[i]=new teacher(names,adds);
            	obj1[i].addco();
             }
	     System.out.println("\nTeacher details are");
             System.out.println("\n********");
             for(i=0;i<p;i++)
             {
              obj1[i].display();
              
             }
	     do
	     {
	       System.out.println("\nMenu\n1.add course\n 2.delete course\n 3. display\n 4. exit\n\nEnter your choice: ");
	       r=Integer.parseInt(br.readLine());
	       switch(r)
	       {
	         case 1: t.add(obj1,p);
			 break;

		 case 2:t.delete(obj1,p);
			break;

		 case 3:  System.out.println("\nTeacher details are:");
			   System.out.println("\n*************");
			  for(i=0;i<p;i++)
			  {
			  obj1[i].display();
			  }
			  break;


	       }

	     }while(r!=4);
	     break;
     case 3:System.exit(1);
   }
 }while(c<3 && c>0);
}
}






