/*
import java.util.*;
class Tokenizer
{
public static void main(String[] args)
{
StringTokenizer str1 = new StringTokenizer("this is deepak");
while(str1.hasMoreTokens())
{
System.out.println(str1.hasMoreTokens());
}
}}
*/

import java.util.*;
class Tokenizer
{
public static void main(String[] args)
{
StringTokenizer str1 = new StringTokenizer("this is deepak");
while(str1.nextToken())
{
System.out.println(str1.nextToken());
}
}}