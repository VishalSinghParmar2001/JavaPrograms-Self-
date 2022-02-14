
import java.util.Scanner;

class AreaRectangle1
{
public static void main(String args[])
{
float l,b,a;
Scanner s = new Scanner(System.in);
System.out.println("Enter value of l:");
l = s.nextFloat();
System.out.println("l="+l);
System.out.println("Enter value of b:");
b= s.nextFloat();
System.out.println("b="+b);
a=l*b;
System.out.println("Area = "+a);  //printfln can print only a single string and only a string 
}
}