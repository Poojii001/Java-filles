/*
//Create a class MessagePrinter with a method MessagePrinter (String name) which prints the //message "hello" <name>
class MessagePrinter 
{
public void printMessage(String name)
{
System.out.println("Hello :"+name);
}
public static void main(String[] args)
{
MessagePrinter mp = new MessagePrinter();
mp.printMessage("Pooja");
}
}

//Create a class Employee  with overloaded constructor to initialize employee details based on different combinations of //arguments .Ensure the constructors support the creation of objects in various ways.

class Employee 
{
int id;
String name;
String department;
Double salary;

//Default constructor
Employee(){
this(0,"Unknown","not assigned",0.0);
}
Employee(int id)
{
this(id,"Unknown","not assigned",0.0);
}
Employee(int id,String name)
{
this(id,"name","not assigned",0.0);
}
Employee(int id,String name,String department,0.0)
{
this(id,"name","department",);
}
Employee(int id,String name,String department ,double salary)
{
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
}
void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: ₹" + salary);
        System.out.println("---------------------------");
}
public static void main(String[] args) {
        Employee e1 = new Employee(); // Default
        Employee e2 = new Employee(101); // Only ID
        Employee e3 = new Employee(102, "Pooja"); // ID + Name
        Employee e4 = new Employee(103, "Rahul", "HR"); // ID + Name + Dept
        Employee e5 = new Employee(104, "Ananya", "IT", 60000.0); // All details

        e1.display();
        e2.display();
        e3.display();
        e4.display();
        e5.display();
    }
}


//Create a class Rectangle with attributes length and width, and each defaulting to 1. The class should include set and get methods for both attributes and a method to calculate the area of rectangle .

class Rectangle
{
double length = 1;
double width = 1;
public void setLength(double length)
{
if(length > 0)
{
this.length = length;
}
else
{
System.out.println("Length must be positive ." +this.length);
}
}
public double getLength()
{
return length;
}

public void setWidth(double width)
{
if(width > 0)
{
this.width = width;
}
else
{
System.out.println("Width must be positive ." +this.width);
}
}
public double getWidth()
{
return width;
}

public double calculateArea()
{
return length * width;
}

public void display() {
        System.out.println("Rectangle Details:");
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + calculateArea());
        System.out.println("---------------------------");
    }

 public static void main(String[] args) {
        Rectangle r1 = new Rectangle();  // Default rectangle
        Rectangle r2 = new Rectangle();

        // Modify attributes using setters
        r2.setLength(5.5);
        r2.setWidth(3.2);

        // Display details
        r1.display();
        r2.display();
    }
}


//Create a Student class with name , rollNo , and marks as attributes. Write a method to calculate the grade based on
 the marks and display the grades.
class Student
{
String name;
int rollNo;
double marks;

public void  calculateGrade()
{
if(marks >=90)
{
System.out.println("You are passed with grade A");
}
else if(marks >= 70)
{
System.out.println("You are passed with grade B");
}
else if(marks >= 50)
{
System.out.println("You are passed with grade C");
}
else
{
System.out.println("You are Fail");
}
}
public void displayDetails()
{
System.out.println("Student Details");
System.out.println("Name : " +name);
System.out.println("Rollno : " +rollNo);
System.out.println("Marks : " + marks);
}

public static void main(String[] args)
{
Student s1 = new Student();
s1.name  = "Pooja";
s1.rollNo = 101;
s1.marks = 89.9;
s1.displayDetails();
s1.calculateGrade();
}
}

//Create a class Employee with members empNo,name , department and salary.In main, create a reference variable of type employee ,allocate memory for the Employee object using a new operator , and initialize the data members using command line arguments.Display the data members.

class Employee
{
int empNo;
String name;
String department;
double salary;
public static void main(String[] args) {
        // Check if all arguments are provided
        if (args.length < 4) {
            System.out.println("Please provide 4 command line arguments: empNo name department salary");
            return;
        }

        // Create a reference variable and allocate memory for the object
        Employee emp = new Employee();

        // Initialize data members using command line arguments
        emp.empNo = Integer.parseInt(args[0]);
        emp.name = args[1];
        emp.department = args[2];
        emp.salary = Double.parseDouble(args[3]);

        // Display employee details
        System.out.println("Employee Details:");
        System.out.println("Employee No: " + emp.empNo);
        System.out.println("Name: " + emp.name);
        System.out.println("Department: " + emp.department);
        System.out.println("Salary: ₹" + emp.salary);
    }
}


//6.Create an employee class with members  empNo,name , department and salary .Use a one-dimentional array of Employee objects  (size 10) to read the data for 5 Employees from command line arguments.Display the data and determine which employee has the highest salary.


class Employee
{
int empNo;
String name;
String department;
double salary;
public static void main(String[] args)
{
Employee[] emp = new Employee[10];
for(int i = 1; i <5; i++)
{
empArray[i] = new Employee();
int index = i*4;
empArray[i].empNo = Integer.parseInt(args[index]);
empArray[i].empname = args[index+1];
empArray[i].empdepartment = args[index+2];
empArray[i].empsalary = Double.parseDouble(args[index+3]);
}

//Display details
System.out.println("Employee Details:");
for(int i = 0; i < 5;i++)
{
System.out.println("Employee no : "+ empArray[i].empNo);
System.out.println("Name : "+empArray[i].empname);
System.out.println("Department :"+empArray[i].empdepartment);
System.out.println("Salary : "+empArray[i].salary);
}
Employee highestSalaryEmp = empArray[0];
        for (int i = 1; i < 5; i++) {
            if (empArray[i].salary > highestSalaryEmp.salary) {
                highestSalaryEmp = empArray[i];
            }
        }

        System.out.println("\nEmployee with Highest Salary:");
        System.out.println("Employee No: " + highestSalaryEmp.empNo);
        System.out.println("Name: " + highestSalaryEmp.name);
        System.out.println("Department: " + highestSalaryEmp.department);
        System.out.println("Salary: ₹" + highestSalaryEmp.salary);
}
}
*/


class Employee {
    int empNo;
    String name;
    String department;
    double salary;

    public static void main(String[] args) {
        // Check if enough arguments are provided (5 employees × 4 attributes = 20)
        if (args.length < 20) {
            System.out.println("Please provide 20 command line arguments for 5 employees: empNo name department salary ...");
            return;
        }

        // Create an array of Employee objects (size 10)
        Employee[] empArray = new Employee[10];

        // Initialize 5 Employee objects using command-line arguments
        for (int i = 0; i < 5; i++) {
            empArray[i] = new Employee();
            int index = i * 4;
            empArray[i].empNo = Integer.parseInt(args[index]);
            empArray[i].name = args[index + 1];
            empArray[i].department = args[index + 2];
            empArray[i].salary = Double.parseDouble(args[index + 3]);
        }

        // Display employee details
        System.out.println("Employee Details:");
        for (int i = 0; i < 5; i++) {
            System.out.println("--------------------------");
            System.out.println("Employee No: " + empArray[i].empNo);
            System.out.println("Name: " + empArray[i].name);
            System.out.println("Department: " + empArray[i].department);
            System.out.println("Salary: ₹" + empArray[i].salary);
        }

        // Find the employee with the highest salary
        Employee highestSalaryEmp = empArray[0];
        for (int i = 1; i < 5; i++) {
            if (empArray[i].salary > highestSalaryEmp.salary) {
                highestSalaryEmp = empArray[i];
            }
        }

        System.out.println("\nEmployee with Highest Salary:");
        System.out.println("Employee No: " + highestSalaryEmp.empNo);
        System.out.println("Name: " + highestSalaryEmp.name);
        System.out.println("Department: " + highestSalaryEmp.department);
        System.out.println("Salary: ₹" + highestSalaryEmp.salary);
    }
}






//Create a class called alphabetChecker with amethod checkVowelOrConsonent(char letter). The method should accept a //character (alphabet) and determine if it is a vowel (a,e,i,o,u) or a consonant. The program should display  a appropriate //messagebased on the input letter .Ensure the method handles both upercase and lowercase letters.

//8.Create a class Store with attributes StoreID StoreName ,ProductList , and Revenue.Implements methods to add a product to //the list ,calculate total revenue and display store information.


