import java.util.Scanner;

class MultiplicationDemo1
{
public static void main (String args[])
{
int a,b,c;
Scanner s=new Scanner(System.in);
System.out.println("Enter value of a:");
a=s.nextInt();
System.out.println("a="+a);
System.out.println("Enter value of b:");
b=s.nextInt();
System.out.println("b="+b);
c=a*b;
System.out.println("Product="+c);
}
}