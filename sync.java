class Data
{
synchronized public static void getData(int x, int y)
{
for(int i =1; i <=2;i++)
{
System.out.println("result iis : "+(x+y));
try
{
Thread.sleep(1000);
}
catch(Exception e)
{
e.printStackTrace();
}
}}}
class MyThread1 extends Thread
{
public void run()
{
Data.getData(11,22);
}}
class MyThread2 extends Thread
{
public void run()
{
Data.getData(1,2);
}}
class MyThread3 extends Thread
{
public void run()
{
Data.getData(5,8);
}}
class Test
{
public static void main(String[] args)
{
MyThread1 t1 = new MyThread1();
t1.start();

MyThread2 t2 = new MyThread2();
t2.start();

MyThread3 t3 = new MyThread3();
t3.start();
}}