/*
class MyThread extends Thread
{
public void run()
{
for(int i = 1; i<=5; i++)
{
System.out.println("User thread");
}
}
public static void main(String[] ags)
{
MyThread t1 = new MyThread();
t1.start();
for(int i = 1; i<=5; i++)
{
System.out.println("Main thread");
}
}
}

class MyThread extends Thread
{
public void run()
{
for(int i = 1; i<=5; i++)
{
System.out.println("User thread");
}
}
public static void main(String[] ags)
{
MyThread t1 = new MyThread();
t1.run();
for(int i = 1; i<=5; i++)
{
System.out.println("Main thread");
}
}
}

//Overloading run():
class MyThread extends Thread
{
public void run()
{
for(int i = 1; i<=5; i++)
{
System.out.println("User thread");
}
this.run(11);
}
public void run(int x)
{
for(int i = 1; i<=5; i++)
{
System.out.println("user2 thread");
}}
public static void main(String[] ags)
{
MyThread t1 = new MyThread();
t1.start();
for(int i = 1; i<=5; i++)
{
System.out.println("Main thread");
}}}

//getname():
class MyThread extends Thread
{
public void run()
{

}
public static void main(String[] args)
{
MyThread t1 = new MyThread();
t1.start();

MyThread t2 = new MyThread();
t2.start();

System.out.println(t1.getName());
System.out.println(t2.getName());
System.out.println(Thread.currentThread().getName());
}
}
*/
//setName():
class MyThread extends Thread
{
public void run()
{

}
public static void main(String[] args)
{
MyThread t1 = new MyThread();
t1.start();

MyThread t2 = new MyThread();
t2.start();

t1.setName("A");
System.out.println(t1.getName());
t2.setName("B");
System.out.println(t2.getName());
Thread.currentThread().setName("Pooja");
System.out.println(Thread.currentThread().getName());
}
}


//getId():

//isAlive():


//activeCount():




