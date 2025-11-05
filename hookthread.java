class MyThread extends Thread
{
public void run()
{
for(int i =1; i <=4;i++)
{
System.out.println("Hook  functionality");
}
public static void main(String[] args)
{
MyThread t1 = new MyThread();
Runtime r = Runtime.getRuntime();
r.addShutdownHook(t1);
for(int i = 1; i<=4; i++)
{
System.out.println("main thread");
try{
Thread.sleep(1000);
}
catch(Exception e)
{
e.printStackTrace();
}
if(i == 1)
{
System.exit(0);
}
}}}