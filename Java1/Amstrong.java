
import java.util.Scanner;

class Amstrong
{
public static void main(String args[])
{
int i,r,n,sum=0;
Scanner s = new Scanner(System.in);
System.out.println("Enter value of n:");
n = s.nextInt();
System.out.println("n="+n);
for(i=n;i>0;i=i/10)
{
	r=i%10;
	sum=sum+(r*r*r);
}
if(sum==n)
{
System.out.println( "Number is Amstrong" );   
}
else
{
System.out.println( "Number is not Amstrong" ); 
}
}
}