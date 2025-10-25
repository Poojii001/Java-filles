/*
//wap to count numbers of vowel in given string.

import java.util.*;
class Q1
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter words :");
String data = sc.nextLine();
data = data.toUpperCase();
System.out.println(data);
int count = 0;
for(int i = 0; i < data.length(); i++)
{
char ch = data.charAt(i);
if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' )
{
count++;
}}
System.out.println(count);
}
}

//wap to accept a code which is contains only a digits.
import java.util.*;
class Q2
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter words :");
String data = sc.nextLine();
String temp = " ";
for(int i = 0; i < data.length(); i++)
{
System.out.println(data);
temp = "";
}}}


//wap to accept a string in lowercase and change the first letter of every.
import java.util.*;
class Q3
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter words :");
String str1 = sc.nextLine();
String arr[] = str1.split(" ");
for(int i = 0; i < arr.length; i++)
{
char ch = arr[i].charAt(0);
String newstr = String.valueOf(ch).toUpperCase();
String str2 = newstr + arr[i].substring(1);
System.out.println(str2+ " ");
}}}
Wap to reverse a given string .
*/

import java.util.*;
class Q4
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter words :");
String str1 = sc.nextLine();
String rev = " ";
for(int i =str1.length()-1 ; i >=0  ; i--)
{
rev = rev +str1.charAt(i);
}
System.out.println(rev);
}}


















