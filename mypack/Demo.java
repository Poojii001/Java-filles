/*
package mypack;
class Demo
{
void add()
{
System.out.println(10+10);

}
}

access.java:12: error: package java.mypack does not exist
import java.mypack.*;
           ^
access.java:18: error: cannot find symbol
Demo d = new Demo();
^
  symbol:   class Demo
  location: class DefaultAccessModifier
access.java:18: error: cannot find symbol
*/

package mypack;
public class Demo
{
protected void add()
{
System.out.println(10+10);
}
}