/*
class OperatorExample
{
public static void main(String[] args)
{
System.out.println('a' + 10);  //97+10=107
System.out.println('a'  + 'a');  //97+97=194
System.out.println(10+10.5f);  //20.5
}
}



class OperatorExample
{
public static void main(String[] args)
{
//System.out.println(10/0);    // Arithmatic Exception / by zero
System.out.println(0/0.0); //NaN
System.out.println(0.0/0); //NaN
System.out.println(-10/0.0); //-Infinity
}
}
*/

class OperatorExample
{
public static  void main(String[] args)
{
OperatorExample obj = new OperatorExample();
System.out.println(obj instanceof  OperatorExample);
System.out.println(obj instanceof  object);
}
}
