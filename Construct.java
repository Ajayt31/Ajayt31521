import java.util.*;

class Construct
{
	int rno,m1,m2,m3;
	String name;
	double per;

	Construct(int rno,String name, int m1, int m2, int m3)
	{
		this.rno=rno;
		this.name=name;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		per=(m1+m2+m3)/3.0;
	}

	void display()
	{
		System.out.println("Student Roll No: "+rno);

                System.out.println("Student Name: "+name);
		 
                System.out.println("Student Percentage: "+per);
	}
}
