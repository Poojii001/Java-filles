/*
File class 
import java.io.*;
class MyFile
{
public static void main(String[] args)
{
File file = new File("abc.txt");
boolean b = file.exists();
if(b)
{
System.out.println("File is present");
}
else
{
System.out.println("File is not present");
}}}
*/
//FileCreate:

import java.io.*;
class MyFile
{
public static void main(String[] args)throws IOException
{
File file = new File("abc.txt");
boolean b = file.createNewFile();
if(b)
{
System.out.println("File is created");
}
else
{
System.out.println("File is not found");
}}}

