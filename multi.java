/*
class SBI extends Thread
{
static int bal = 100000;
static int withdraw;
SBI(int withdraw)
{
this.withdraw = withdraw;
}
static synchronized void amount()
{
String name = Thread.currentThread().getName();
if(withdraw <= bal)
{
System.out.println(name + " withdraw amount =" +withdraw);
bal = bal - withdraw;
}
else
{
System.out.println("insufficient bal");
}
}
public void run()
{
this.amount();
}
}
class Customer
{
public static void main(String[] args)
{
SBI s1 = new SBI(100000);
Thread t1 = new Thread(s1);
Thread t2 = new Thread(s1);
t1.start();
t2.start();
t1.setName("anil");
t2.setName("ankit");

SBI s2 = new SBI(100000);
Thread t3 = new Thread(s2);
Thread t4 = new Thread(s2);
t3.start();
t4.start();
t3.setName("anil");
t4.setName("ankit");
}
}

//without extends

class MyThread
{
public static void main(String[] args)
{
Thread t1 = new Thread()
{
public void run()
{
for(int i = 1; i<=5; i++)
{
System.out.println("main thread");
try
{
Thread.sleep(1000);
}
catch(Exception e)
{
e.printStackTrace();
}}}};
t1.start();
}}
*/
//by using interface

class MyRunnable implements Runnable
{
public void run()
{
for(int i = 1; i <= 5; i++)
{
System.out.println("user thread");
try
{
Thread.sleep(1000);
}
catch(Exception e)
{
e.printStackTrace();
}}}
public static void main(String[] args)
{
MyRunnable r = new MyRunnable();
Thread t1 = new Thread(r);
t1.start();

for(int i = 1; i <=5; i++)
{
System.out.println("main thread");
try
{
Thread.sleep(1000);
}
catch(Exception e)
{
e.printStackTrace();
}}}
}