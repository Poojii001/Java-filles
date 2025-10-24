/*
import java.util.Scanner;
class MyException extends Exception
{
MyException(String msg)
{
super(msg);
}
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter your age :");
int age = sc.nextInt();
if(age >18)
{
System.out.println("You are eligible for vote");
}

else
{
System.out.println("You are not eligible for vote ");
}
System.out.println("rest of code");
}
}


import java.util.Scanner;
class MyException extends Exception
{
MyException(String msg)
{
super(msg);
}
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
try{
System.out.println("Enter your age :");
int age = sc.nextInt();
if(age >18)
{
System.out.println("You are eligible for vote");
}
else
{
throw new Exception( "You are not eligible for vote ");
}
}
catch(Exception e)
{
System.out.println(e);
}
System.out.println("rest of code");
}
}
*/
