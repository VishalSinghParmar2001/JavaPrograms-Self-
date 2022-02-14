import java.util.Scanner;

class ArrayAddition
{
public static void main(String ags[])
{
int i,size;
Scanner s=new Scanner(System.in);
System.out.println("Enter size of array:-");
size=s.nextInt();
int a[]=new int[size];
int b[]=new int[size];
int c[]=new int[size];
System.out.println("Enter "+size+" elements of 1st array:");
for(i=0;i<size;i++)
{
a[i]=s.nextInt();
}
System.out.println("Enter "+size+" elements of 2nd array:");
for(i=0;i<size;i++)
{
b[i]=s.nextInt();
}
for(i=0;i<size;i++)
{
c[i]=a[i]+b[i];
}
System.out.println("Addition of two array are:");
for(i=0;i<size;i++)
{
System.out.println(c[i]);
}
}
}