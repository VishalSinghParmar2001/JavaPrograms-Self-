import java.util.Scanner;

class ArraySearching
{
public static void main(String ags[])
{
int i,size,n,f=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter size of array:-");
size=s.nextInt();
int a[]=new int[size];
System.out.println("Enter "+size+" elements:");
for(i=0;i<size;i++)
{
a[i]=s.nextInt();
}
System.out.println("Enter element you want to search:-");
n=s.nextInt();
for(i=0;i<size;i++)
{
	if(n==a[i])
	{
	f=1;
	}
}
if(f==1)
{
System.out.println("Element Found");
}
else
{
System.out.println("Element Not Found");
}
}
}