/*
class  InstanceVariableExample
{
int x ;
float  f ;
boolean b;
char ch;
long l;
double d;
public static void main(String[] args)
{
InstanceVariableExample  obj  = new  InstanceVariableExample();
System.out.println(obj.x);
System.out.println(obj.f);
System.out.println(obj.b);
System.out.println(obj.ch);
System.out.println(obj.l);
System.out.println(obj.d);
}
}



2.
class InstanceVariableExample
{
int x = 10;
public static void main(String[] args)
{
InstanceVariableExample obj = new InstanceVariableExample();
System.out.println(obj.x);
{
System.out.println(obj.x);

}
}
}

3.
import java.util.Scanner;
class InstanceVariableExample
{
int x;
public static void main(String[] args)
{
InstanceVariableExample obj = new InstanceVariableExample();
Scanner input = new Scanner(System.in);
System.out.println("Enter the number :");
obj.x = input.nextInt();
System.out.println("Entered number is : " +obj.x);
}
}
*/

import java.util.Scanner;
class InstanceVariableExample
{
private int x;
public static void main(String[] args)
{
InstanceVariableExample obj = new InstanceVariableExample();
Scanner input = new Scanner(System.in);
System.out.println("Enter the number :");
obj.x = input.nextInt();
System.out.println("Entered number is : " +obj.x);
}
}



