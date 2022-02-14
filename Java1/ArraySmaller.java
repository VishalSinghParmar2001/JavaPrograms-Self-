import java.util.Scanner;

class ArraySmaller
{
public static void main(String ags[])
{
int i,size,min;
Scanner s=new Scanner(System.in);
System.out.println("Enter size of array:-");
size=s.nextInt();
int a[]=new int[size];
System.out.println("Enter "+size+" elements:");
for(i=0;i<size;i++)
{
a[i]=s.nextInt();
}
min=a[0];
for(i=0;i<size;i++)
{
	if(min>a[i])
	{
	min=a[i];
	}
}
System.out.println("Smaller Number in an array:-"+min);
}
}