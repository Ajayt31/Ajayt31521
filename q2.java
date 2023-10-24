import java.io.*;
abstract class shape
{
  float length;
  float width;
  shape(float l,float w)
	{
  		length=l;
  		width=w;
	}
   	abstract void display();
   	abstract void area();
}

class circle extends shape
{
	circle(float l,float w)
 	{
   		super(l,w);
 	}
  	void display()
 	{
 		System.out.println("\nRadius of a circle is:"+length);
	}
void area()
{
 	double a;
 	a=3.14*length*length;
 	System.out.println("\nArea of Circle is:"+a);


}
}

class rectangle extends shape
{
 	rectangle(float l,float w)
 	{
 		super(l,w);
 	}

 	void display()
 	{
 		System.out.println("\nLength of  rectangle is:"+length);
  		System.out.println("\nWidth of rectangle is:"+width);

 	}

void area()
{
 	double a;
 	a=length*width;
 	System.out.println("\nArea of Rectangle is:"+a);

}
}

class q2
{
	public static void main(String args[])throws IOException
	{
		float r,len,wid;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		do
		{
			System.out.println("\nEnter the radius of thr circle:");
			r=Float.parseFloat(br.readLine());
		}

		while(r<=0);
		circle obj1=new circle(r,1);
		obj1.area();

		do
		{

			System.out.println("\nEnter length and width of Rectangle:");
			len=Float.parseFloat(br.readLine());
			wid=Float.parseFloat(br.readLine());
		}while(len<=0 || wid<=0);


		rectangle obj2=new rectangle(len,wid);
		obj2.display();
		obj2.area();
	}	

}
