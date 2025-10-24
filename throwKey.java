/*
class MyException
{
public static void main(String[] args)
{
throw new ArithmeticException("Enter a valid number");
}
}

class MyException
{
public static void main(String[] args)
{
try
{
System.out.println(10/0);
}
catch(ArithmeticException ie)
{
throw new ArithmeticException("Enter a valid number");
}
}
}

import java.io.*;
class MyException
{
public static void main(String[] args) throws IOException
{
FileInputStream fis = new FileInputStream("data.txt");
System.out.println("File opened successfully!");
}
}
*/
import java.io.*;
class MyException
{
public void readData()throws FileNotFoundException
{
FileInputStream fis = new  FileInputStream("dbs.txt");
}
public static void main(String[] args)
{
MyException obj = new MyException();
try
{
obj.readData();
}
catch(FileNotFoundException e)
{
System.out.println(e);
}
System.out.println("rest of code");
}
}

