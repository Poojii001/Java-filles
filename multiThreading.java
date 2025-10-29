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