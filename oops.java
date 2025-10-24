/*
class Student
{
int id ;
String name;
String course;
String city;
String state;
public static void main(String[] args)
{
Student s1 = new Student();
s1.id = 1;
s1.name = "Pooja";
s1.course = "Java";
s1.city = "Noida";
s1.state = "UP";
System.out.println(s1.id+" "+s1.name+" "+s1.course+" "+s1.city+" "+s1.state);

Student s2 = new Student();
s2.id = 2;
s2.name = "Harsh";
s2.course = "Java";
s2.city = "Noida";
s2.state = "UP";
System.out.println(s2.id+" "+s2.name+" "+s2.course+" "+s2.city+" "+s2.state);

}}

import java.util.Scanner;
class Student
{
int id ;
String name;
String course;
String city;
String state;
public static void main(String[] args)
{
Scanner input = new Scanner(System.in);
Student s1 = new Student();

System.out.println("Enter id:");
s1.id = input.nextInt();
input.nextLine();

System.out.println("Enter name :");
s1.name = input.nextLine();

System.out.println("Enter course:");
s1.course = input.nextLine();

System.out.println("Enter city:");
s1.city = input.nextLine();

System.out.println("Enter state:");
s1.state = input.nextLine();

System.out.println(s1.id+" "+s1.name+" "+s1.course+" "+s1.city+" "+s1.state);
}}


//Methods In java 
import java.util.Scanner;
class Myclass
{
String name;
String course;
public void getData();
Scanner sc = new Scanner(System.in);

System.out.println("Enter name:");
name = sc.nextLine();
System.out.println("Enter course:");
course = sc.nextLine();
}
public void displayData()
{
System.out.println("Name is :" +name);
System.out.println("Course is :" +course);
}
public static void main(String[] args)
{
Myclass obj = new Myclass();
obj.getData();
Myclass obj1 = new Myclass();
obj1.getData();

obj.displayData();
obj1.displayData();
}

//Create a class calculator with the following methods:
//calculateSum(int number1, int number2) to calculate the sum of two numbers.
//calculateDiff(int number1, int number2) to calculate the difference of two numbers.
import java.util.Scanner;
class Calculator
{
public int calculateSum(int num1,int num2)
{
return num1 + num2;
}
public int calculateDiff(int num1 ,int num2)
{
return num1 - num2;
}
public static void main(String[] args)
{
Calculator obj = new Calculator();
Scanner sc = new Scanner(System.in);
System.out.println("Enter first number :");
int x = sc.nextInt();
System.out.println("Enter second number :");
int y = sc.nextInt();

System.out.println(obj.calculateSum(x,y));
System.out.println(obj.calculateDiff(x,y));

}
}


//Wap to simple calculator (+ ,- ,*, /,%) using method with the heip of switch statement.

import java.util.Scanner;
class Calculator
{
public double add(double a, double b)
{
return a+b;
}
public double sub(double a, double b)
{
return a-b;
}
public double mul(double a, double b)
{
return a*b;
}
public double div(double a, double b)
{
if(b==0)
{
System.out.println("Error: Division by zero");
return 0;
}
return a/b;
}
public double mod(double a, double b)
{
return a%b;
}

public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
Calculator calc = new Calculator(); 

System.out.println("Enter first number :");
double num1 = sc.nextDouble();

System.out.println("Enter second number :");
double num2 = sc.nextDouble();

System.out.println("Enter a any single operator : +,-,*,/,%");
char operator = sc.next().charAt(0);

double result;

switch(operator)
{
case '+':
     result = calc.add(num1,num2);
     break;
case '-':
     result = calc.sub(num1,num2);
     break;
case '*':
     result = calc.mul(num1,num2);
     break;
case '/':
     result = calc.div(num1,num2);
     break;
case '%':
     result = calc.mod(num1,num2);
     break;
default :
	System.out.println("Invalid Operator");
return ;
}
System.out.println("Results :"+result);

}
}

//create a employee table with method employeesData based on different combinations of arguments .
id ,name ,designation,salary, state,address.
*/
import java.util.Scanner;
class Employee
{
int id;
String name;
String dsg;
double salary;
String satate;
String address;
public void getData();
Scanner sc = new Scanner(System.in);

System.out.println("Enter id:");
id = sc.nextLine();

System.out.println("Enter name:");
name = sc.nextLine();

System.out.println("Enter dsg:");
dsg = sc.nextLine();

System.out.println("Enter salary:");
salary = sc.nextLine();

System.out.println("Enter state:");
state = sc.nextLine();

System.out.println("Enter address:");
address= sc.nextLine();
}
public void displayData()
{
System.out.println("id is :" +id);
System.out.println("Name is :" +name);
System.out.println("Designation is :" +dsg);
System.out.println("Salary is :" +salary);
System.out.println("Stste is :" +state);
System.out.println("Address is :" +address);



}
public static void main(String[] args)
{
Employee obj = new Employee();

obj.displayData();
}
