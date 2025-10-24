/*
import java.util.Scanner;
class Q1
{
public static void main(String[] args)
{
int sqr=0;
Scanner sc= new Scanner(System.in);
System.out.println("Enter a number :");
int num = sc.nextInt();

while( num!=0)
{
sqr=num*num;

System.out.println("Square is :" +sqr);
num = sc.nextInt();
}
}}

import java.util.Scanner;
class Armstrong
{
public static void main(String[] args)
{
int d = 0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number :");
int n = sc.nextInt();
int num = n;
while(num!=0)
{
d++;
num = num/10;
}
num = n;
double sum = 0;
while(num!=0)
{
int r = num % 10;
sum = sum+Math.pow(r,d);
num = num/10;
}
if(sum == n)
{
System.out.println("Armstrong Number ");
}
else
{
System.out.println("Not Armstrong Number ");
}
}}

import java.util.Scanner;
class Palindrome
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number:");
int n = sc.nextInt();

int rev = 0;
int num = n;

while(num!=0);
{
int r = num%10;
rev = rev*10+r;
num = num /10;
}
if(rev == n)
{
System.out.println("Palindrome number :");
}
else
{
System.out.println("Not Palindrome number :");
}
}
}
*/
import java.util.Scanner;
class Palindrome
{
public static void main(String[] args)
{
cha = op;
do
{

Scanner sc = new Scanner(System.in);
System.out.println("Enter first number:");
int num1 = sc.nextInt();
System.out.println("Enter second number:");
int num2 = sc.nextInt();


int z = num1 + num2;
System.out.println("The sum is :"+z);

System.out.println("If you want to another calculation press (Y/y)");
op = sc.next().charAt(0);
}
while(op=='Y' || op=='y');

}}













