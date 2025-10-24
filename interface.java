/*
interface A
{
void sum();
void sub();
}
class B implements  A
{
public void sum()
{
System.out.println(10+20);
}
public void sub()
{
System.out.println(20-10);
}
public static void main(String[] args)
{
B obj = new B();
obj.sum();
obj.sub();
}
}

//two interface

interface A
{
void sum();
}
interface B
{
void sub();
}
class C implements A,B
{
public void sum()
{
System.out.println("The sum is :"+(10+20));
}
public void sub()
{
System.out.println("The sub is :"+(10-20));
}
public static void main(String[] args)
{
C obj = new C();
obj.sum();
obj.sub();
}}
//java 8
interface MyInterface1
{
int a = 10,b = 20;
default void sub()
{
System.out.println(a-b);
}
static void add()
{
System.out.println(a+b);
}
}
class A implements MyInterface1
{
public static void main(String[] args)
{
A i = new A();
i.sub();
MyInterface1.add();
}}
*/
interface Bank
{
double rateofinterest();
}
class PNB implements Bank
{
public double rateofinterest()
{
return 11.5;
}
}
class Test 
{
public static void main(String[] args)
{
PNB p  = new PNB();
System.out.println("The rate of interest PNB is : "+p.rateofinterest() + "%");
}
}
