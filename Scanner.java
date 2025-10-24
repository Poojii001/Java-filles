/* 
import java.util.Scanner;
class MyClass
{
public static void main(String[] args)
{
Scanner input = new Scanner(System.in);
System.out.println("Enter Your name :");
String name = input.nextLine();
System.out.println("Enter your age :");
int age = input.nextInt();


System.out.println("Enter your name : "+name +"  Enter your age :" +age);
}
}


//Wap to create simple calculator.

import java.util.Scanner;
class Calculator
{
public static void main(String[] args)
{
int x,y,z;
Scanner input = new Scanner(System.in);
System.out.println("Enter the first number :");
x =input.nextInt();

System.out.println("Enter the second number :");
y= input.nextInt();

z=x+y;
System.out.println("The sum is = " +z);

z=x-y;
System.out.println("The sub is = " +z);

z=x*y;
System.out.println("The mul is = " +z);

z=x/y;
System.out.println("The division is = " +z);


z=x%y;
System.out.println("The modulas is = " +z);

}
}

*/

//Wap to calculate emi for amount period and interest in java.

import java.util.Scanner;
class emiCalculate
{
public static void main(String[] args)
{
int p, r, t, si, total, emi;
Scanner input = new Scanner(System.in);

System.out.println("Enter the principal amount : ");
p = input.nextInt();

System.out.println("Enter the rate of  interest : ");
r = input.nextInt();


System.out.println("Enter the Rate of  time : ");
t = input.nextInt();

si = p*r*t/100;
total = p+si;
emi= total/(t*12);

System.out.println("Principal Amount  = " +p);
System.out.println("Tate of interest = " +r);
System.out.println("Year's = " +t);
System.out.println("Simple Interest = " +si);
System.out.println("Total amount  to pay= " +total);
System.out.println("Emi  = " +emi);

}
}





















