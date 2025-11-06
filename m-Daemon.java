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
t1.setDaemon(true);
System.out.println(t1.isDaemon());
t1.start();
for(int i = 1; i<=4; i++)
{
System.out.println("main thread");
try{
Thread.sleep(1000);
}
catch(Exception e)
{
System.out.println("InterruptedException");
}
if(i == 2)
System.exit(0);
}}}