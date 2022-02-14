class A
{
void show()
{
System.out.println("india");
}
}

class B extends A
{
void show1()
{
System.out.println("M.P");
}
}

class C extends B
{
void show2()
{
System.out.println("mera ghar");
}
}

class MultiLevelDemo
{
public static void main(String args[])
{
A a=new A();
B b=new B();
C c=new C();

a.show();

b.show();
b.show1();

c.show();
c.show2();

}
}
