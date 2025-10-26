/*
class StringBufferExample
{
public static void main(String[] args)
{
StringBuffer sb = new StringBuffer("ducat");
System.out.println(sb);
sb.append(5,"noida");
System.out.println(sb);
}
}

//insert()
class StringBufferExample
{
public static void main(String[] args)
{
StringBuffer sb = new StringBuffer("ducat");
System.out.println(sb);
sb.insert(5,"india");
System.out.println(sb);
}
}

//reverse()
class StringBufferExample
{
public static void main(String[] args)
{
StringBuffer sb = new StringBuffer("ducat");
System.out.println(sb);
System.out.println(sb.reverse());
}
}

//replace()
class StringBufferExample
{
public static void main(String[] args)
{
StringBuffer sbf = new StringBuffer("pooja");
System.out.println(sbf);
sbf.replace(3,6,"pal");
System.out.println("After replacing string buffer "+sbf);
}
}

//capacity()
class StringBufferExample
{
public static void main(String[] args)
{
StringBuffer sbf = new StringBuffer();
System.out.println(sbf);
int capacity = sbf.capacity();
System.out.println(capacity);
}
}
*/
//ensure()
class StringBufferExample
{
public static void main(String[] args)
{
StringBuffer sbf = new StringBuffer();
sbf.ensureCapacity(16);
System.out.println(sbf.capacity());
sbf.ensureCapacity(17);
System.out.println(sbf.capacity());
}
}


