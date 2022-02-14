
import java.util.Scanner;

class Prime
{
public static void main(String args[])
{
int i,n,r,f=1;
Scanner s = new Scanner(System.in);
System.out.println("Enter value of n:");
n = s.nextInt();
System.out.println("n="+n);
for(i=2;i<n;i++)
{
	r=n%i;
	if(r==0)
	{
		f=0;
	}
}
if(f==1)  
{
System.out.println( "Number is Prime" );
}
else
{
System.out.println( "Number is not Prime" );
}
}
}
   