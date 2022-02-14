abstract class A
{
abstract void show();
void display()
{
System.out.println("Inside normal method");
}
}

class B extends A
{
void show()
{
System.out.println("Inside abstract method");
}
}

class AbtractionDemo
{
public static void main(String args[])
{
//A a = new A();
B b = new B();
b.show();
b.display();
}
}