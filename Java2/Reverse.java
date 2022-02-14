
import java.util.Scanner;

class Reverse
{
public static void main(String args[])
{
int i,n,r=0;
Scanner s = new Scanner(System.in);
System.out.println("Enter value of n:");
n = s.nextInt();
System.out.println("n="+n);
for(i=n;i>0;i=i/10)
{
	r=r*10;
	r=r+(i%10);
}
System.out.println("Reverse Number = "+r);  //printfln can print only a single string and only a string 
}
}