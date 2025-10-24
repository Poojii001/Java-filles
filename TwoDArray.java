/*
class TwoDArray
{
public static void main(String[] args)
{
int arr[] [] = {{11,22}, {33,44}};
for(int i = 0; i<arr.length;i++)
{
for(int j = 0; j < arr.length; j++)
{
System.out.println(arr[i] [j] + "\t" );
}
System.out.println();
}
}}
*/

import java.util.Scanner;
class TwoDArray
{
public static void main(String[] args)
{
Scanner input = new Scanner(System.in);
System.out.println("Enter the number of rows in an array");
int r = input.nextInt();

System.out.println("Enter the number of column in an array");
int c = input.nextInt();

int arr[] [] = new int[r][c];
System.out.println("Enter array elements:");
for(int i = 0; i < r; i++)
{
for(int j = 0; j < c;j++)
{
arr[i][j] = input.nextInt();
}
}
System.out.println("Enter array elements :");
for(int i = 0; i < r; i++)
{
for(int j = 0; j < c;j++)
{
System.out.print(arr[i][j]+ "\t");
}
System.out.println();
}}
}
