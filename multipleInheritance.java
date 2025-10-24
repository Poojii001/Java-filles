/*
class Parent
{
int salary = 10000;
}
class Child1 extends Parent
{
int child_salary1 = 50000;
}
class Child2 extends Child1
{
int child_salary2 = 25000;
public static void main(String[] args)
{
Child2 c1 = new Child2();
System.out.println("Parent Salary = "+c1.salary+ "Child  Salary1 = "+c1.child_salarry1+ "Child Salary = "+c1.child_salary2);
}
}
*/
//Wap to accept a student name and  3 marks. Calculate the total and average and display the result using  a class and object.

import java.util.Scanner;
class Student
{
String name;
void getName () 
{

Scanner sc = new Scanner(System.in);
System.out.println("Enter your name:");
name = sc.nextLine();
}
}
class Marks extends Student
{
int m1,m2,m3;
void getMarks()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter mark   1 :");
m1 = sc.nextInt();
System.out.println("Enter mark   2 :");
m2 = sc.nextInt();
System.out.println("Enter mark   3 :");
m3 = sc.nextInt();
}
}
class Result extends Marks
{
int total;
double average;
void calculate()
{
total = m1+m2+m3;

average = total/3.0;
}

void display()
{
System.out.println("\n------------Enter results------------");
System.out.println("Name :" +name);
System.out.println("Marks :" +m1+ " ," +m2+"  ,"+m3);
System.out.println("Total  :"+total);
System.out.println("Average : "+average);
}
}

// Main class

public class multipleInheritance {
public static void main(String[] args) {
Result r1 = new Result();  // Object of the last derived class
r1.getName();
r1.getMarks();
r1.calculate();
r1.display();
    }
}

