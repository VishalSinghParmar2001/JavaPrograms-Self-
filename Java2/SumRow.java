
import java.util.Scanner;

class SumRow
{
public static void main(String args[])
{
int a[][]=new int[3][3];
int i,j;
int sum=0;
Scanner s= new Scanner(System.in);
System.out.println("enter the 9 values:");
for(i=0;i<=2; i++)
{
	for(j=0; j<=2; j++)
	{
	a[i][j]=s.nextInt();
	}
}

for(i=0;i<3;i++)
{
	for(j=0;j<3;j++)
	{
	sum=sum+a[i][j];
	}
System.out.println("sum of row"+(" ")+(" ")+"is"+(" ")+sum);
sum=0;
}
}
}