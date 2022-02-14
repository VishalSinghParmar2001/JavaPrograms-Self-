import java.util.Scanner;

class OddNumber
{
public static void main ( String args [])
{
int i,n;
Scanner s = new Scanner(System.in);
System.out.println("Enter value of n:");
n = s.nextInt();
System.out.println("n="+n);
for(i=1;i<=n;i++)
{
if(i%2!=0)
{
System.out.println(+i);
}
}
}
} 