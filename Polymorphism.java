//Compile time polymorphism 
/*
class Data 
{
int x = 10;
int y = 20;
public void cal()
{
System.out.println(x*y);
}
public void cal(int x)
{
if(x%2==0)
System.out.println(x+ "is a even number ");
else
System.out.println(x + " is a odd number ");
}
public static void main(String[] args)
{
Data db = new Data();
db.cal();
db.cal(4);
}
}
*/
//Run time polymorphism
class Parent
{
public void properties()
{
System.out.println("Cash" + "Land" + "Jew");
}
public void marry()
{
System.out.println("We have selected a girl for you");
}
}
class Child extends Parent
{
public void marry()
{
System.out.println("I have selected a girl who is well qualified");
}
public static void main(String[] args)
{
Child ob = new Child();
ob.properties();
ob.marry();
}
}
