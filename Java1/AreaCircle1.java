
import java.util.Scanner;

class AreaCircle1
{
public static void main(String args[])
{
double r,a;
Scanner s = new Scanner(System.in);
System.out.println("Enter value of r:");
r = s.nextDouble();
System.out.println("r="+r);
a=(3.14*r*r);
System.out.println("Area = "+a);  //printfln can print only a single string and only a string 
}
}