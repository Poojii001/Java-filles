/*
abstract class Ducat
{
abstract void Developer();
}
class Project1 extends Ducat
{
public void Developer()
{
System.out.println("There are 4  java developer working on project 1 ");
}}
class Project2 extends Ducat
{
public void Developer()
{
System.out.println("There are 4  php developer working on project 2");
}}
class Project3 extends Ducat
{
public void Developer()
{
System.out.println("There are 4  android  developer working on project 3 ");
}}
class Test
{
public static void main(String[] args)
{
Ducat obj1 = new Project1();
obj1.Developer();

Ducat obj2 = new Project2();
obj2.Developer();


Ducat obj3 = new Project3();
obj3.Developer();
}}

abstract class Car 
{
abstract void run();
}
class User1 extends Car
{
public void run()
{
System.out.println("I am buying car .......");
}
public static void main(String[] args)
{
User1 obj = new User1();
obj.run();
}}
*/

abstract class Car
{
abstract void run();
void cost()
{
System.out.println("Cost of the car = " +500000);
}}
class User1 extends Car
{
public void run()
{
System.out.println("I am buying a Car ....... ");
}
public static void main(String[] args)
{
User1 obj = new User1();

obj.run();
obj.cost();
}
}

