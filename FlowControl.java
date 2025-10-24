/*
import java.util.Scanner;
class IfStatementExample
{
public static void main(String[] args)
{
Scanner input = new Scanner(System.in);
System.out.println("Enter amount :");
int amount = input.nextInt();
if(amount >=500)
{
System.out.println("lets have  coffee in starbucks");
}
System.out.println("Go back to home");

}
}

//Wap to find greater number in the 3 number using if statement.

import  java.util.Scanner;
class IfStatementExample
{
public static void main(String[] args)
{
Scanner input = new Scanner(System.in);

System.out.println("Enter the first number ");
int num1 = input.nextInt();

System.out.println("Enter the second number ");
int num2 = input.nextInt();

System.out.println("Enter the third number ");
int num3 = input.nextInt();

if(num1>num2  &&  num1>num3)
{
System.out.println("First number is greater " +num1);
}

if(num2>num1  &&  num2>num3)
{
System.out.println("Second number is greater " +num2);
}

if(num3>num1  &&  num3>num2)
{
System.out.println("Third number is greater " +num3);
}

}
}

//if else statement

import java.util.Scanner;
class Q3
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Eggs :");
int eggs = sc.nextInt();

int dozens = eggs/12;
System.out.println("You have : "+dozens+ " dozens eggs");

float tp = eggs*7;

if(eggs>=1  && eggs<=30)
{
System.out.println("Before discount amount is : " +tp);
System.out.println("You get the discount             : "+(tp*0.01));
System.out.println("Final Price                                :"+(tp-(tp*0.01)));
}
else
{
System.out.println("Before discount amount      : "+tp);
System.out.println("You get the discount             : "+(tp*0.02));
System.out.println("Final Price                                :"+(tp-(tp*0.02)));
}
}
}


//Wap  to check number  is even and odd

import java.util.Scanner;
class Q4
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number :");
int num = sc.nextInt();

if(num%2==0){
System.out.println("Number is Even=" +num);
}
else 
{
System.out.println("Number is odd ="+num);
}
}
}


//WAp to check whether an entered number is vowel or consonant.

import java.util.Scanner;
class Q5
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter character :");
char ch = sc.next().charAt(0);

if(ch=='a' || ch=='e' || ch=='i'  || ch=='o' || ch=='u' || ch=='A' || ch=='E'  || ch=='I' || ch=='O' || ch=='U' )
{
System.out.println("Char  is  Vowel ="+ch);
}

else 
{
System.out.println("Char  is  Consonant ="+ch);
}
}
}

//if else if Statement

import  java.util.Scanner;
class Q6
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the amount :");
int amount = sc.nextInt();

if(amount>=2000)
{
System.out.println("lets have a coffee in starbucks");
}
else if(amount>=1000  &&  amount<2000)
{
System.out.println("lets have coffee in ccd");
}
else if(amount>=500 &&  amount<1000)
{
System.out.println("lets have coffee in macd");
}

else if(amount>=100  &&  amount<500)
{
System.out.println("lets have coffee in normal shop");
}

else
{
System.out.println("lets have tea");
}
System.out.println("lets go back to the home");
}
}


//simple calculator

import java.util.Scanner;
class calculator
{
public static void main(String[] args)
{
int z=0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter any one character  : (+,-,*,/,%)");
char op = sc.next().charAt(0);

System.out.println("Enter first number");
int num1= sc.nextInt();

System.out.println("Enter second number");
int num2= sc.nextInt();

if(op=='+')
{
z=num1+num2;
}
if(op=='-')
{
z=num1-num2;
}
if(op=='*')
{
z=num1*num2;
}
if(op=='/')
{
z=num1/num2;
}
if(op=='%')
{
z=num1%num2;
}

else
{
System.out.println("Invalid character Input");
}
System.out.println("Result is =" +z);
//System.out.println("num1+ " "+op+"  "+num2+"=+z);
}
}

//WAP to find  grade of students using if else if statement.
import java.util.Scanner ;
class Grade
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);  
System.out.println("Enter marks :");
double marks = sc.nextDouble();

if(marks>=90  &&  marks<=100)
{
System.out.println("Marks is :"+marks+"  marks and you get a grade A");
}
else if(marks>=80  &&  marks<=90)
{
System.out.println("Marks is :"+marks+"  marks  and you get a grade B");
}

else if(marks>=70  &&  marks<=80)
{
System.out.println("Marks is :"+marks+"  marks and you get a grade C");
}

else if(marks>=60  &&  marks<=50)
{
System.out.println("Marks is :"+marks+"  marks and you get a grade D");
}

else 
{
System.out.println("You are fail with =" +marks);
}
}
}


//Wap to check whether an entered character is lower case  vowel,lower case consonant and upper and special symbol.
import java.util.Scanner;
class Q1
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Character :");
char ch = sc.next().charAt(0);

if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')
{
System.out.println("lower case vowel =" +ch); 
}

else if(ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='O')
{
System.out.println("upper case vowel =" +ch); 
}
else 
{
System.out.println("consonant " +ch);
}
}
}


//Wap to print a name of months according to a given numbers.

import java.util.Scanner;
class Months
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter months:");
int months = sc.nextInt();

if(months==1|| months==3|| months==5|| months==7|| months==8|| months==10|| months==12)
{
System.out.println("This Months is 31 days"); 
}

else if(months==4|| months==6|| months==9|| months==11)
{
System.out.println("This Months is 30 days"); 
}
else
{
System.out.println("28 is a leap year");
}
}
}

//Wap to print name of weelday (1-7) according to a given number.

import java.util.Scanner;
class Day
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

System.out.println("Enter the day number :");
int day = sc.nextInt();

if(day == 1)
{
System.out.println("The day is monday ="+day);
}

else if(day == 2)
{
System.out.println("The day is tuesday ="+day);
}

else if(day == 3)
{
System.out.println("The day is wensdayday ="+day);
}

else if(day == 4)
{
System.out.println("The day is Thursday ="+day);
}

else if(day == 5)
{
System.out.println("The day is friday ="+day);
}

else if(day == 6)
{
System.out.println("The day is saturday ="+day);
}

else if(day == 7)
{
System.out.println("The day is sunday ="+day);
}
else 
{
System.out.println("Invalid day");
}
}
}


//switch statements

class SwitchExample
{
public static void main(String[] args)
{
byte b = 100;
switch(b)
{

case 100:
System.out.println("case 100");
break;
case 200:
System.out.println(" case 200");
break;
default:
System.out.println("Default case");
}
}}

FlowControl.java:376: error: incompatible types: possible lossy conversion from int to byte
case 200:
     ^
1 error


class SwitchExample
{
public static void main(String[] args)
{
int x = 97;
switch(x)
{

case  97:
System.out.println("case 97");
break;
case  98:
System.out.println(" case 98");
break;

case  'a':
System.out.println(" case a");
break;
default:
System.out.println("Default case");
}
}}
FlowControl.java:405: error: duplicate case label
case  'a':
^
1 error


//Wap to print weekday using switch
import java.util.Scanner;
class SwitchExample
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter   number ");
int day = sc.nextInt();
switch(day)
{
case 1:
System.out.println("Week Day");
break;

case 2:
System.out.println("Week Day");
break;


case 3:
System.out.println("Week Day");
break;

case 4:
System.out.println("Week Day");
break;

case 5:
System.out.println("Week Day");
break;

case 6:
System.out.println("Weekend");
break;

case 7:
System.out.println("Weekend");
break;

default:
System.out.println("Unknown");

}
}}

import java.util.Scanner;
class SwitchExample
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter   number ");
int day = sc.nextInt();
switch(day)
{
case "Monday":
System.out.println("Week Day");
break;

case "Tuesday":
System.out.println("Week Day");
break;


case "Wensday":
System.out.println("Week Day");
break;

case "Thursday":
System.out.println("Week Day");
break;

case "Friday":
System.out.println("Week Day");
break;

case "Saturday":
System.out.println("Weekend");
break;

case "Sunday":
System.out.println("Weekend");
break;

default:
System.out.println("Unknown");
}
}}

//yield 

import java.util.Scanner;
class SwitchExample
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter   name of weekday ");
String day = sc.nextLine();
String res = switch(day)
{
case "Monday":
yield"Week Day";

case "Tuesday":
yield"Week Day";

case "Wensday":
yield"Week Day";

case "Thursday":
yield"Week Day";

case "Friday":
yield"Week Day";

case "Saturday":
yield"Weekend";
case "Sunday":
yield"Weekend";

default:
yield"Unknown";
};
System.out.println(res);
}}

//Arrow Operataor
import java.util.Scanner;
class SwitchExample
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter   name of weekday ");
String day = sc.nextLine();
String res = switch(day)
{
case "Monday" -> "Week Day";

case "Tuesday" -> "Week Day";

case "Wensday" -> "Week Day";

case "Thursday" -> "Week Day";

case "Friday" -> "Week Day";

case "Saturday" -> "Weekend";

case "Sunday" -> "Weekend";

default-> "Unknown";
};
System.out.println(res);
}}

//2.
import java.util.Scanner;
class SwitchExample
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter   name of weekday ");
String day = sc.nextLine();
String res = switch(day)
{
case "Monday" ,"Tuesday" ,"Wensday" ,"Thursday","Friday" ->"Week day";

case "Saturday","Sunday" -> "Weekend";
default-> "Unknown";
};
System.out.println(res);
}}


// WAP to find a grade if student
import java.util.Scanner;
class SwitchExample
{
public static void main(String[] args)
{
int op = 0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter marks");
double marks = sc.nextDouble();


if(marks>=90  &&  marks<=100)
{
op = 1;
}
else if(marks>=80  &&  marks<90)
{
op = 2;
}
else if(marks>=70  &&  marks<80)
{
op = 3;
}
else if(marks>=60  &&  marks<70)
{
op = 4;
}
else
{
op = 0;
}
String res = switch(op)
{
case 1:
yield "Grade A";

case 2:
yield "Grade  B";

case 3:
yield "Grade C";

case 4:
yield "Grade D";

default: 
yield "Fail";
};
System.out.println(res);
}
}

//Wap to create simple calculator

import java.util.Scanner;
class SwitchExample
{
public static void main(String[] args)
{

Scanner sc = new Scanner(System.in);
System.out.println("Enter first number :");
double num1 = sc.nextInt();

System.out.println("Enter second number :");
double num2 = sc.nextInt();
System.out.println("Enter any Operator :(+, -, *, /, %)");
char op = sc.next().charAt(0);
double result = switch(op)
{
case '+' -> num1 + num2;
case '-' -> num1 - num2;
case '*' -> num1 * num2;


case '/' -> {
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed!");
                    yield Double.NaN; // special value for "Not a Number"
                } else {
                    yield num1 / num2;
                }
            }
            case '%' -> num1 % num2;
            default -> {
                System.out.println("Invalid operator!");
                yield Double.NaN;
            }
        };

        if (!Double.isNaN(result)) {
            System.out.println("Result = " + result);
        }


}
}
*/
//WAP to check given char is vowel or consonannt
import java.util.Scanner;
class SwitchExample
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a single character :");
char ch = sc.next().charAt(0);

if(ch =='a' || ch =='e' || ch =='i' || ch =='i' || ch =='u' )
{
ch = 1
}
else 
{
ch = 0
}

String ch = result(switch)
{
case 1:
yield ->"Vowel";

case 2:
yield ->"Consonant";
}
}


//WAP to print months according to number.






















