import java.util.Scanner;

class ArrayGreater
{
public static void main(String ags[])
{
int i,size,max;
Scanner s=new Scanner(System.in);
System.out.println("Enter size of array:-");
size=s.nextInt();
int a[]=new int[size];
System.out.println("Enter "+size+" elements:");
for(i=0;i<size;i++)
{
a[i]=s.nextInt();
}
max=a[0];
for(i=0;i<size;i++)
{
	if(max<a[i])
	{
	max=a[i];
	}
}
System.out.println("Greater Number in an array:-"+max);
}
}