import java.util.Scanner;

class BookInstaller
{
public static void main ( String args [])
{
int p;
Scanner s=new Scanner(System.in);
System.out.println("Enter a number of copis of book :");
p=s.nextInt();
System.out.println("p="+p);
if(p<20)
{	
System.out.println("5% discount");
}
else
{
	if(p<50)
	{
	System.out.println("10% discount");
	}
	else
	{
		if(p<100)
		{
		System.out.println("15% discount");
		}
		else
		{
		System.out.println("20% discount");
		}
	}
}
}
}