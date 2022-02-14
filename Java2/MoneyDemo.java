import java.util.Scanner;

class Money
{
float r;
float p;

void getdata()
{
Scanner s = new Scanner(System.in);
System.out.println("Enter the value of Rs.:-");
r=s.nextFloat();
System.out.println("Enter the value of Paise:-");
p=s.nextFloat();
}

void showdata()
{
System.out.println("Value of Rs.:-"+r);
System.out.println("Value of Paise:-"+p);
}

void rtop()
{
p=r*100;
System.out.println("Value in Paise after conversion:-"+p);
}

void ptor()
{
r=p/100;
System.out.println("Value in Rs. after conversion:-"+r);
}

}

class MoneyDemo
{
public static void main(String args[])
{
Money m1= new Money();
m1.getdata();
m1.showdata();
m1.rtop();
m1.ptor();
}
}