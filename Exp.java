/*
class Test
{
public static void main(String[] args)
{
System.out.println("hello world1");
System.out.println("hello world2");
System.out.println(10/0);
System.out.println("hello world3");
System.out.println("hello world4");
}
}
hello world1
hello world2
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Test.main(Exp.java:7)

Runtime or unChecked
class RuntimeException
{
public static void main(String[] args)
{
int arr[] = {11,22,33,44,55};
System.out.println(arr[11]);
}}
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 5
        at RuntimeException.main(Exp.java:24)

class compiletimeException
{
public static void main(String[] args)
{
Class.forName("com.mysql.jdbc.Driver");
}
}
error: unreported exception ClassNotFoundException; must be caught or declared to be thrown
Class.forName("com.mysql.jdbc.Driver");

1.using try catch

import java.util.*;
class MyException
{
public static void main(String[] args)
{
System.out.println("main thread start : ");
try
{
Scanner sc = new Scanner(System.in);
System.out.println("enter a number :");
int x = sc.nextInt();
System.out.println(10/x);
}
catch(ArithmaticException ie)
{
System.out.println(ie);
}
System.out.println("rest of code ");
}}

 import java.util.*;
class MyExp
{
public static void main(String[] args)
{
System.out.println("main thread start : ");
try
{
Scanner sc = new Scanner(System.in);
System.out.println("enter a number :");
int x = sc.nextInt();
System.out.println(10/x);
}
System.out.println("hii : ");
catch(Exception ie)
{
System.out.println(ie);
}
System.out.println("rest of code ");
}}
error: 'try' without 'catch', 'finally' or resource declarations
try


 import java.util.Scanner;
class MyException
{
public static void main(String[] args)
{
System.out.println("main thread start : ");
try
{
Scanner sc = new Scanner(System.in);
System.out.println("enter a number :");
int x = sc.nextInt();
System.out.println(10/x);
System.out.println("deepak".charAt(11));
}
catch(Exception ie)
{
System.out.println(ie);
}
System.out.println("rest of code ");
}}
//try with multipe catch
import java.util.Scanner;
class MyException
{
public static void main(String[] args)
{
System.out.println("main thread start : ");
try
{
Scanner sc = new Scanner(System.in);
System.out.println("enter a number :");
int x = sc.nextInt();
System.out.println(10/x);
System.out.println("deepak".charAt(11));
}
catch(ArithmeticException e)
{
System.out.println(10/2);
}
catch(StringIndexOutOfBoundsException ie)
{
System.out.println("deepak".charAt(1));
}
System.out.println("rest of code ");
}}

//java 7
import java.util.Scanner;
class MyException
{
public static void main(String[] args)
{
System.out.println("main thread start : ");
try
{
Scanner sc = new Scanner(System.in);
System.out.println("enter a number :");
int x = sc.nextInt();
System.out.println(10/x);
//System.out.println("deepak".charAt(11));
}
catch(ArithmeticException | StringIndexOutOfBoundsException ie)
{
System.out.println(ie);
}
System.out.println("rest of code ");
}}
*/











