import java.util.Scanner;

class ArraySorting
{
public static void main(String ags[])
{
int i,j,b,size;
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
	for(j=i+1;j<size;j++)
	{
		if(a[i]>a[j])
		{
			b=a[i];
			a[i]=a[j];
			a[j]=b;
		}
	}
}
System.out.println("Final Array after Sorting: -");
for(i=0;i<size;i++)
{
System.out.println(a[i]);
}
}
}