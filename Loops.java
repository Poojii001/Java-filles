/*
class LoopsExample
{
public static void main(String[] args)
{
for(;  ;)
System.out.println("hii");
}
}
error :Loop will execute infinite time


//obj2:
class LoopsExample
{
public static void main(String[] args)
{
for(int i = 0;  ;i++)
System.out.println("hii");
}
}
error:Loop will execute infinite time
obj3

class LoopsExample
{
public static void main(String[] args)
{
for(int i = 0;false;i++)
System.out.println("hii");
}
}
Loops.java:31: error: unreachable statement
System.out.println("hii");
^
1 error

Obj4

class LoopsExample
{
public static void main(String[] args)
{
int a=10,b=20;
for(int i = 0;a<b;i++)
{
System.out.println("hii");
}
System.out.println("hello");
}}
error :Loop will execute infinite time 

Obj 5
class LoopsExample
{
public static void main(String[] args)
{
final int a=10,b=20;
for(int i = 0;a<b;i++)
{
System.out.println("hii");
}
System.out.println("hello");
}} 
Loops.java:65: error: unreachable statement
System.out.println("hello");
^
1 error
obj
class LoopsExample
{
public static void main(String[] args)
{
final int a=10,b=20;
for(int i =0;a>b;i++)
{
System.out.println("hii");
}
System.out.println("hello");
}} 
Loops.java:77: error: unreachable statement
{
^
1 error

class LoopsExample
{
public static void main(String[] args)
{
final int a=10,b=20;
for(int i =0;i<=3;i++)
int x =14;
System.out.println(x);
}}
Loops.java:92: error: variable declaration not allowed here
int x =14;
    ^
1 error
//WAP to sumof n natural number.

import java.util.Scanner;
class LoopsExample
{
public static void main(String[] args)
{
int sum = 0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number to start a loop:");
int start = sc.nextInt();
System.out.println("Enter a number to end a loop:");
int end = sc.nextInt();

for(int i = start; i<=end;i++)
{
sum=sum+i;
System.out.println(i);
}
System.out.println("The sum of element are : "+sum);
}}


//wap print table of any given number using for loop in java.
import java.util.Scanner;
class LoopsExample
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number to start loop:");
int start = sc.nextInt();
System.out.println("Enter a number to end loop:");
int end = sc.nextInt();

System.out.println("Enter a number :");
int table = sc.nextInt();
for(int i = start;i<=end;i++)
{
System.out.println(table + "*" +i+ "=" +(table*i)); 
}
}}

//wap to find even number in a specific range using for loop.
import java.util.Scanner;
class LoopsExample
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number to start loop:");
int start = sc.nextInt();
System.out.println("Enter a number to end loop:");
int end = sc.nextInt();

for(int i = start;i<=end;i++)
{
if(i%2==0){
System.out.println("Even number : " +i);
}
}
}}

//print a factorial of a given number .
import java.util.Scanner;
class LoopsExample
{
public static void main(String[] args)
{
int fact =1;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number :");
int n = sc.nextInt();

for(int i = 1; i<=n;i++)
{
fact = fact*i;
}
System.out.println("The fact is :"+fact);
}}

//check whether a number is prime or not.
import java.util.Scanner;
class LoopsExample
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number :");
int n = sc.nextInt();
int  flag= 0;
for(int i = 1; i<=n/2;i++)
{
if(num%i==0){
flag = true;
break;
}
}
if (flag == false && num>=2)
System.out.println("The Prime is :"+n);
else 
{
System.out.println("The Prime  is not :"+n);
}
}}


import java.util.Scanner;
class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean isPrime = true;   // assume number is prime

        if (num <= 1) {
            isPrime = false;  // 0 and 1 are not prime
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;  // divisible by another number
                    break;            // no need to check further
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is a Prime number.");
        } else {
            System.out.println(num + " is Not a Prime number.");
        }

        sc.close();
    }
}
*/
//perfect number square
 