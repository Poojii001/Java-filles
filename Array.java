/*
class ArrayExample 
{
public static void main(String[] args)
{
int arr[] = new int[5];
arr[0] = 10;
arr[1] = 20;
arr[2] = 30;
arr[3] = 40;
arr[4] = 50;
System.out.println(arr[0]);
System.out.println(arr[1]);
System.out.println(arr[2]);
System.out.println(arr[3]);
System.out.println(arr[4]);
}
}


class ArrayExample 
{
public static void main(String[] args)
{
int arr[] = {10,20,30,40,50};
for(int i = 0; i < 5; i++)
{
System.out.println(arr[i]);
}
}}
10
20
30
40
50

class ArrayExample 
{
public static void main(String[] args)
{
int arr[] = {10,20,30,40,50};
for(int i = 0; i < arr.length; i++)
{
System.out.println(arr[i]);
}
}}
forech loop

class ArrayExample
{

public static void main(String[] args)
{
int arr[] = {10,20,30,40,50};
for(int i : arr)
{
System.out.println(i);
}
}}


import java.util.Scanner;
class ArrayExample
{
public static void main(String[] args)
{
Scanner input = new Scanner(System.in);
System.out.println("Enter size of an array :");
int s=input.nextInt();

int arr[] = new int[s];
System.out.println("Enter array elements :" +s);
for(int i =0; i < arr.length; i++)
{
arr[i] = input.nextInt();
}
System.out.println("Enter array elements :");
for(int i =0; i < arr.length; i++)
{
System.out.println(arr[i]);
}
}}


import java.util.Scanner;
class ArrayExample
{
public static void main(String[] args)
{
int sum = 0;
Scanner input = new Scanner(System.in);
System.out.println("Enter size of an array :");
int s=input.nextInt();

int arr[] = new int[s];
System.out.println("Enter array elements :" +s);
for(int i =0; i < arr.length; i++)
{
arr[i] = input.nextInt();
}
System.out.println("Enter array elements :");
for(int i =0; i < arr.length; i++)
{
sum = sum+arr[i];
}
System.out.println("The sum of array elements are :"+sum);
}}


import java.util.Scanner;
class ArrayExample
{
public static void main(String[] args)
{

Scanner input = new Scanner(System.in);
System.out.println("Enter size of an array :");
int s=input.nextInt();

int arr[] = new int[s];
System.out.println("Enter array elements :" +s);
for(int i =0; i < arr.length; i++)
{
arr[i] = input.nextInt();
}
System.out.println("Enter array elements :");
for(int i =0; i < arr.length; i++)
{
if(arr[i]%2==0)
System.out.println("The even number of array elements are :"+arr[i]);
}
}}
*/


import java.util.Scanner;
class ArrayExample
{
public static void main(String[] args)
{

Scanner input = new Scanner(System.in);
System.out.println("Enter size of an array :");
int s=input.nextInt();

int arr[] = new int[s];
System.out.println("Enter array elements :" +s);
for(int i =0; i < arr.length; i++)
{
arr[i] = input.nextInt();
}
System.out.println("Enter array elements :");

int largest = arr[0];
int smallest = arr[0];
for(int i =0; i < arr.length; i++)
{
if (arr[i] > largest) {
largest = arr[i];
}
if (arr[i] < smallest) {
 smallest = arr[i];
 }
}
System.out.println("Largest number in the array is: " + largest);
System.out.println("Smallest number in the array is: " + smallest);
}}


















