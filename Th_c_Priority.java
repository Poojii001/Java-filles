/*
class MyThread extends Thread
{
public void run()
{
System.out.println(Thread.currentThread().getName());
}
public static void main(String[] args)
{
MyThread t1 = new MyThread();
t1.start();

System.out.println(Thread.MIN_PRIORITY);
System.out.println(Thread.NORM_PRIORITY);
System.out.println(Thread.MAX_PRIORITY);
//t1.setPriority();
System.out.println(t1.getPriority());
}}
*/

//sleep():

class MyThread extends Thread
{
public void run()
{
for(int i = 1; i<=5; i++)
{
System.out.println("user thread");
try 
{
Thread.sleep(1000);
}
catch(InterruptedException e)
{
System.out.println(e);
}
}}
public static void main(String[] args)throws InterruptedException
{
MyThread t1 = new MyThread();
t1.start();
for(int i = 0; i <=5; i++)
{
System.out.println("main thread");
Thread.sleep(1000);
}
}}