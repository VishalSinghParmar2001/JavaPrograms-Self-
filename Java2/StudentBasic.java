import java.util.Scanner;

class Student
{
String name;
int rollno;
int physics,chemistry,maths,total;
float per;

void getdata()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter name:-");
name=s.next();
System.out.println("Enter Roll Number:-");
rollno=s.nextInt();
System.out.println("Enter Physics:-");
physics=s.nextInt();
System.out.println("Enter Chemistry:-");
chemistry=s.nextInt();
System.out.println("Enter Maths:-");
maths=s.nextInt();
}

void showdata()
{
System.out.println("Name:-"+name);
System.out.println("Roll number:-"+rollno);
System.out.println("Physics:-"+physics);
System.out.println("Chemistry:-"+chemistry);
System.out.println("Maths:-"+maths);
}

void total()
{
total=physics+chemistry+maths;
System.out.println("totalmarks:"+total);
}

void percentage()
{
per=total/3;
System.out.println("Per:"+per);
}

void division()
{
	if(per>60)
	{
	System.out.println("first division");
	}
	else
	{
		if(per>=45)
		{
		System.out.println("second division");
		}
		else
		{
			if(per>=33)
			{
			System.out.println("third division");
			}
			else
			{
			System.out.println("fail division");
			}
		}
	}
}
}

class StudentBasic
{
public static void main(String args[])
{
Student s1=new Student();
s1.getdata();
s1.showdata();
s1.total();
s1.percentage();
s1.division();
}
}






