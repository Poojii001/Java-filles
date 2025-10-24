import java.util.Scanner;
class TwoDArray
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number  rows :");
int rows = sc.nextInt();

int arr[] [] = new int[rows][]; //jagged array declaration 

//taking number of columns for each row
System.out.println("rows"  +arr.length);
for(int i =0; i < rows; i++)
{
int cols = sc.nextInt();
arr[i] = new int [cols];
}
System.out.println("Enter array elements :");
for(int i = 0; i < arr.length; i++)
{
for(int j = 0; j < arr[i].length; j++)
{
arr[i][j] = sc.nextInt();
}}
System.out.println("After  entered array elements are :");
for(int i = 0; i < arr.length; i++)
{
for(int j = 0; j < arr[i].length; j++)
{
System.out.print(arr[i] [j]+ " \t");
}
System.out.println();
}
}}
