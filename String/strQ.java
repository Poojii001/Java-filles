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
 