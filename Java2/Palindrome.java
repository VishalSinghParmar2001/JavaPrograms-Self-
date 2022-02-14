
import java.util.Scanner;

class Palindrome
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
if(n==r)
{
System.out.println( "Number is Palindrome" );   
}
else
{
System.out.println( "Number is not Palindrome" ); 
}
}
}