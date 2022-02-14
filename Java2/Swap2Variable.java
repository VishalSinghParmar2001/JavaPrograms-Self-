import java.util.Scanner;

class Swap2Variable
{
public static void main(String args[])
{
int a,b;
Scanner s = new Scanner(System.in);
System.out.println("Enter value of a:");
a = s.nextInt();
System.out.println("a="+a);
System.out.println("Enter value of b:");
b = s.nextInt();
System.out.println("b="+b);
a=a+b;
b=a-b;
a=a-b;
System.out.println("After Swapping Value of a and b are: -");  //printfln can print only a single string and only a string 
System.out.println("a="+a);
System.out.println("b="+b);
}
}