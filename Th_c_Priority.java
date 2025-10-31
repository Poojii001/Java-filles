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