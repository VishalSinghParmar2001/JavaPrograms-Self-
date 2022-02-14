import java.util.Scanner;

class Person
{
String name,add;
void getdata()
{
Scanner s= new Scanner(System.in);
System.out.println("enter the name of the person:-");
name=s.next();
System.out.println("enter the adderes of the person:-");
add=s.next();
}

void showdata()
{
System.out.println("name= "+name);
System.out.println("address of the person"+add);
}
}

class Student extends Person
{
int rollno,marks;
void getdata()
{
super.getdata();
Scanner s= new Scanner(System.in);
System.out.println("enter the roll number of the student:-");
rollno=s.nextInt();
System.out.println("enter the marks of the person:-");
marks=s.nextInt();
}

void showdata()
{
super.showdata();
System.out.println("Roll Number: -"+rollno);
System.out.println("Marks:"+marks);
}
}

class Employe extends Person
{
int empid;
int sal;
void getdata()
{
super.getdata();
Scanner s= new Scanner(System.in);
System.out.println("enter the employe id:-");
empid=s.nextInt();
System.out.println("enter the salary of employe:-");
sal=s.nextInt();
}

void showdata()
{
super.showdata();
System.out.println("Emplo id"+empid);
System.out.println("Salary"+sal);
}
}

class OverRidingDemo2
{
public static void main(String args[])
{
Student s = new Student();
Employe e = new Employe();

s.getdata();
s.showdata();

e.getdata();
e.showdata();
}
}
