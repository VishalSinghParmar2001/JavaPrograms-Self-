import java.util.Scanner;

class Pattern14
{
public static void main ( String args [])
{
int i,j;
for(i=5;i>=1;i--)
{
	for(j=5;j>=i;j--)
	{	
	System.out.print(" ");
	}	
	for(j=i;j>=1;j--)
	{	
	System.out.print("*"+" ");
	}
System.out.println(" ");
}
}
} 
