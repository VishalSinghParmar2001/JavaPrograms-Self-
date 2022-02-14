class Arathmatic
{
int a,b;
{
a=0;
b=0;
}
Arathmatic(int a, int b)
{
a=x;
b=y;
}
void operation()
{
System.out.println("operation not found");
}
}

class Addition extends Arathmatic
{
Addition()
{
super();
}
Addition(int x, int y)
{
super(x,y);
}

void operation()
{
int c;
c=a+b;
System.out.println("Addition="+c);
}
}

class Subtraction extends Arathmatic
{
Subtraction()
{
super();
}
Subtraction( int x, int y)
{
super(x,y);
}
void operation()
{
int c;
c=a-b;
System.out.println("Subbtraction="+c);
}
}

class Multification extends Arathmatic
{
Multification()
{
super();
}
Multification( int x, int y)
{
super(x,y);
}
void operation()
{
int c;
c=a*b;
System.out.println("Multification="+c);
}
}


class Division extends Arathmatic
{
Division()
{
super();
}
Division( int x, int y)
{
super(x,y);
}
void operation()
{
int c;
c=a/b;
System.out.println("Division ="+c);
}
}


class AllThings
{
public static void main(String args[])
{
Arathmatic ref;
ref=new Addition(4,5);
ref.operation();
ref= new Subtraction(8,3);
ref.operation();
ref=new Multification(5,5);
ref.operation();
ref=new Division(100,20);
ref.operation();
}
}