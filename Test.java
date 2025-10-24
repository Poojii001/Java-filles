class A
{
int x = 10;
int y = 20;
}
class B extends A
{
void add()
{
System.out.println("The sum is = "+(x+y));
}
}
class C extends A
{
void mul()
{
System.out.println("The mul is ="+(x+y));
}
}
class Test
{
public static void main(String[] args)
{
B b = new B();
b.add();

C obj = new C();
obj.mul();
}
}