
/*
//Single inheritance using variable .
class Parent
{
int salary = 500000;
}
class child extends Parent
{
int child_salary = 25000;
public static void main(String[] args)
{
child c1 = new child();
System.out.println("Parent Salary =" +c1.salary +"child  salary ="+c1.child_salary);
}
}

//this keyword
class Parent 
{
int x;
int y;
public void getData(int x, int y) 
{
this.x = x;
this.y= y;
}
public void display()
{
System.out.println(x+ " " +y);
}
public static void main(String[] args)
{

Parent p = new Parent();
p.getData(11,22);
p.display();
}
}

class Parent 
{
public void getData() 
{
System.out.println(this);
}
public static void main(String[] args)
{
Parent p = new Parent();
System.out.println(p);//Parent@7ad041f3
p.getData();//Parent@7ad041f3

}
}

//Super keyword

class Parent
{
int x = 10;
int y = 20;
}
class Child extends Parent
{
int x = 30;
int y =40;
public void getData()
{
System.out.println(super.x+" "+super.y);
System.out.println(this.x+" "+this.y);
}
public static void main(String[] args)
{
Child c1 = new Child();
c1.getData();
}}

with constructor
*/
class Parent
{
Parent()
{
System.out.println("Hiii..");
}
Parent(String str)
{
int x =10;
int y = 20;
System.out.println(x+ " " +y);
}}
class Child extends Parent
{
int x =30;
int y =40;
Child()
{
super("deepak");
System.out.println(this.x+ " " +this.y);
}
Child(float f)
{
System.out.println(this.x+ " " +this.y);
}
public static void main(String[] args)
{
Child c1 = new Child();
}
}









