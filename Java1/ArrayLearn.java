import java.util.Scanner;

class ArrayLearn
{
public static void main(String args[])
{
int i,size;
Scanner S=new Scanner(System.in);
System.out.println("enter the size of array:");
size=S.nextInt();
int a[]= new int [size];
System.out.println("enter the "+size+" of elements:");
for(i=0; i<=size;i++)
{
a[i]=S.nextInt();
}
for(i=0;i<size;i++)
{
System.out.println(a[i]);
}
}
}
