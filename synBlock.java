/*
class Student
{
public void Data(String name)
{
//1-100
synchronized(this)
{
for(int i = 1; i <=4; i++)
{
System.out.println(name);
try
{
Thread.sleep(1000);
}
catch(InterruptedException ie)
{
ie.printStackTrace();
}
}}}}

class Demo extends Thread
{
Student s;
String name;
Demo(Student s,String name)
{
this.s = s;
this.name = name;
}
public void run()
{
s.Data(name);
}}
class Test
{
public static void main(String[] args)
{
Student s =new Student();

Demo demo1 = new Demo(s,"Harsh");
demo1.start();

Demo demo2 = new Demo(s,"Pooja");
demo2.start();

Demo demo3 = new Demo(s,"Mahi");
demo3.start();
}}
//Methods
//await():

class MyThread extends Thread
{
int sum = 0;
public void run()
{
for(int i = 1; i <= 10; i++)
{
sum = sum+i;
}}
public static void main(String[] args)throws InterruptedException
{
MyThread t1 = new MyThread();
t1.start();
System.out.println(t1.sum);
}}
*/
class MyThread extends Thread
{
int sum = 0;
public void run()
{
synchronized(this)
{
for(int i = 1; i <= 5; i++)
{
sum = sum+i;
}
this.notify();
}}
public static void main(String[] args)throws InterruptedException
{
MyThread t1 = new MyThread();
t1.start();
synchronized(t1)
{
t1.wait();
System.out.println(t1.sum);
}
}}