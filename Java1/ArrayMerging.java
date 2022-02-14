import java.util.Scanner;

class ArrayMerging
{
public static void main(String ags[])
{
int i,j,x,y,z;
Scanner s=new Scanner(System.in);
System.out.println("Enter size of 1st array:-");
x=s.nextInt();
System.out.println("Enter size of 2nd array:-");
y=s.nextInt();
z=x+y;
int a[]=new int[x];
int b[]=new int[y];
int c[]=new int[z];
System.out.println("Enter "+x+" elements of 1st array:");
for(i=0;i<x;i++)
{
a[i]=s.nextInt();
}
System.out.println("Enter "+y+" elements of 2nd array:");
for(i=0;i<y;i++)
{
b[i]=s.nextInt();
}
for(i=0;i<x;i++)
{
c[i]=a[i];
}
for(j=0;j<y;j++)
{
c[i]=b[j];
i++;
}
System.out.println("Array after merging of two arrays:");
for(i=0;i<z;i++)
{
System.out.println(c[i]);
}
}
}