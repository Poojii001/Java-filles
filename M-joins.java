class MyThread extends Thread
{
public void run()
{
for(int i = 1; i<=5; i++)
{
System.out.println("User Interface");
try{
Thread.sleep(1000);
}
catch(InterruptedException e)
{
System.out.println(e);
}
}}
public static void  main(String[] args) throws InterruptedException
{
MyThread t1 = new MyThread();
t1.start();
//t1.join();
for(int i = 1; i<=5; i++)
{
System.out.println("main thread");
Thread.sleep(1000);
}
}
}