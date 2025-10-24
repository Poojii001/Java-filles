import java.io.*;
class sum
{
public static void main(String[] args) throws Exception
{
int x,y;
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);

System.out.println("Enter first number :");
x = Integer.parseInt(br.readLine());
System.out.println("Enter second number :");
y = Integer.parseInt(br.readLine());

System.out.println("The sum is = " +(x+y));
}
}