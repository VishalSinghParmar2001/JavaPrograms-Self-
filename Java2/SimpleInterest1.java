
import java.util.Scanner;

class SimpleInterest1
{
public static void main(String args[])
{
float p,r,t,si;
Scanner s = new Scanner(System.in);
System.out.println("Enter value of p:");
p = s.nextFloat();
System.out.println("p="+p);
System.out.println("Enter value of r:");
r = s.nextFloat();
System.out.println("r="+r);
System.out.println("Enter value of t:");
t = s.nextFloat();
System.out.println("t="+t);
si=(p*r*t)/100;
System.out.println("Simple Interest = "+si);  //printfln can print only a single string and only a string 
}
}