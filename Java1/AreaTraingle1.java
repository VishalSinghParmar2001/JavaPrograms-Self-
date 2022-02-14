
import java.util.Scanner;

class AreaTraingle1
{
public static void main(String args[])
{
float b,h,a;
Scanner s = new Scanner(System.in);
System.out.println("Enter value of b:");
b = s.nextFloat();
System.out.println("b="+b);
System.out.println("Enter value of h:");
h= s.nextFloat();
System.out.println("h="+h);
a=(b*h)/2;
System.out.println("Area = "+a);  //printfln can print only a single string and only a string 
}
}