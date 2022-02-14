import java.util.Scanner;

class ArrayDemoReverse
{
public static void main(String ags[])
{
int i,size;
Scanner s=new Scanner(System.in);
System.out.println("Enter size of array:-");
size=s.nextInt();
int a[]=new int[size];
System.out.println("Enter "+size+" elements:");
for(i=0;i<size;i++)
{
a[i]=s.nextInt();
}
System.out.println("Elements in Reverse Order are:");
for(i=size-1;i>=0;i--)
{
System.out.println(a[i]);
}
}
}