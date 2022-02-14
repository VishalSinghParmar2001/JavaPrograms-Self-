import java.util.Scanner;

class ArrayPrime
{
public static void main(String ags[])
{
int i,size,j,p;
Scanner s=new Scanner(System.in);
System.out.println("Enter size of array:-");
size=s.nextInt();
int arr[]=new int[size];
System.out.println("Enter "+size+" elements:");
for(i=0;i<size;i++)
{
arr[i]=s.nextInt();
}
System.out.println("All prime list is:");
for(i=0;i<size;i++)
{
	p=0;
	for(j=2;j<arr[i];j++)
	{
        	if(arr[i]%j==0)
                {
                 	p=1;
                        break;
                 }
	}
        if(p==0)
        {
        	System.out.println(arr[i]);
        }
}
}
}