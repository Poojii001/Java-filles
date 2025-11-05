class MyThread extends Thread
{
public void run()
{
for(int i =1; i <=4;i++)
{
System.out.println("user thread");
try
{
Thread.sleep(1000);
}
catch(Exception e)
{
System.out.println("InterruptedException");
}
}}
public static void main(String[] args)
{
MyThread t1 = new MyThread();
t1.interrupt();
t1.start();
}}