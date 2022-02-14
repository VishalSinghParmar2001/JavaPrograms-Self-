import java.util.Scanner;

class ArraySum
{
public static void main(String ags[])
{
int i,size,sum=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter size of array:-");
size=s.nextInt();
int a[]=new int[size];
System.out.println("Enter "+size+" elements:");
for(i=0;i<size;i++)
{
a[i]=s.nextInt();
}
for(i=0;i<size;i++)
{
sum=sum+a[i];
}
System.out.println("Sum="+sum);
}
}