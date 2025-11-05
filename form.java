class form_fill extends Thread
{
public void run()
{
System.out.println("Form fill up start");
try
{
Thread.sleep(2000);
}
catch(Exception e)
{
e.printStackTrace();
}
System.out.println("form complete");
}
}
class form_check extends Thread
{
public void run()
{
System.out.println("form checking start");
try{
Thread.sleep(2000);
}
catch(Exception e)
{
e.printStackTrace();
}
System.out.println("fom checking complete");
}}
class Test_Drive extends Thread
{
public void run()
{
System.out.println("Test Drive start");
try
{
Thread.sleep(2000);
}
catch(Exception e)
{
e.printStackTrace();
}
System.out.println("Test Drive complete");
}
}
class DL extends Thread
{
public void run()
{
System.out.println("DL process start");
try
{
Thread.sleep(2000);
}
catch(Exception e)
{
e.printStackTrace();
}
System.out.println("DL  got");
}
}
class Test
{
public static void main(String[] args) throws Exception
{
form_fill  file = new  form_fill();
file.start();
file.join();

form_check  ch = new  form_check();
ch.start();
ch.join();

Test_Drive test = new  Test_Drive();
test.start();
test.join();

DL  dl = new  DL();
dl.start();
dl.join();
}
}



