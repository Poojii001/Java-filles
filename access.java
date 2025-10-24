/*
class DefaultAccessModifier
{
int x = 10;
public static void main(String[] args)
{
DefaultAccessModifier obj = new DefaultAccessModifier();
System.out.println(obj.x);
}
}
import java.mypack.*;
class DefaultAccessModifier
{
int x = 10;
public static void main(String[] args)
{
Demo d = new Demo();
d.add();
}
}

//public Access Modifier
import mypack.Demo;
class AccessModifier
{
public static void main(String[] args)
{
Demo d = new Demo();
d.add();
}}


//private 

class AccessModifier
{
private int x= 10;
}
class Test
{
public static void main(String[] args)
{
AccessModifier d = new AccessModifier();
System.out.println(d.x);
}}
access.java:44: error: x has private access in AccessModifier
System.out.println(d.x);
*/

//protected AM

import mypack.Demo;
class AccessModifier extends Demo 
{
public static void main(String[] args)
{
AccessModifier d = new AccessModifier();
d.add();
}}

