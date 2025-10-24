/*
class MyString
{
public static void main(String[] args)
{
String str = "ducat";
str.concat("noida");
System.out.println( str);
}
}

//not concat()

//using new keyword

class MyString
{
public static void main(String[] args)
{
String str = new String("ducat");
str.concat("noida");
System.out.println( str);
}
}
//2.equal
class MyString
{
public static void main(String[] args)
{
String str1 = "ducat";
String str2 = "ducat";
String str3 = "noida";

boolean b = str1.equals(str2);
System.out.println(b);  //true

b = str1.equals(str3);
System.out.println(b);

b = str3.equals(str1);
System.out.println(b);  //true
}}

3.== operator

class MyString
{
public static void main(String[] args)
{
String str1 = "ducat";
String str2 = "ducat";
String str3 = "noida";

boolean b = str1==str2;
System.out.println(b);  //true

b = str1==str3;
System.out.println(b);

String s1 = new String("ducat");
b= str1 == str2;
System.out.println(b);
}}

comapreTo():
class MyString
{
public static void main(String[] args)
{
String str1 = "ducat";
String str2 = "ducat";
String str3 = "noida";

int i = str1.compareTo(str2);
System.out.println(i);  //0

i = str1.compareTo(str3);
System.out.println(i); //-10

i= str3.compareTo(str2);
System.out.println(i); //10
}}


//5.equalsIgnoreCase();

class MyString
{
public static void main(String[] args)
{
String str1 = "Ducat";
String str2 = "ducat";

boolean b = str1.equals(str2);
System.out.println(b);  //f

b = str1.equalsIgnoreCase(str2);
System.out.println(b); //t
}}

//6.length():

class MyString
{
public static void main(String[] args)
{
String str1 = "DUCAT";
int len = str1.length();
System.out.println(len);	
}
}

//7.replace(); 
class MyString
{
public static void main(String[] args)
{
String str1 = "ducat study";
//System.out.println(str1.replace('d' , 'D'));	
System.out.println(str1.replaceFirst("d", "D"));	
}
}

//8.substring():
class MyString
{
public static void main(String[] args)
{
String str1 = "ducat study";
System.out.println(str1.substring(4));	
System.out.println(str1.substring(1,8));	
}
}

//9.toLowerCase():
class MyString
{
public static void main(String[] args)
{
String str1 = "DUCAT INDIA";
System.out.println(str1.toLowerCase());	
String str2 = "ducat noida";
System.out.println(str2.toUpperCase());	
}
}

//10.toUpperCase():
class MyString
{
public static void main(String[] args)
{
String str1 = "DUCAT INDIA";
System.out.println(str1.toLowerCase());	
String str2 = "ducat noida";
System.out.println(str2.toUpperCase());	
}
}

//11.valueOf():
class MyString
{
public static void main(String[] args)
{
int x = 10;
System.out.println("Integer value : "+x);
String str = String.valueOf(x);
System.out.println("String value :"+str);
System.out.println(str.getClass());
}
}

//12.trim():
class MyString
{
public static void main(String[] args)
{
String str = "      ducat      ";
System.out.println(str.length());	
str =  str.trim();
System.out.println(str.length());	
}
}

//13.contains():
class MyString
{
public static void main(String[] args)
{
String str = "ducat";
System.out.println(str.contains("cat"));	
System.out.println(str.contains("du"));	
System.out.println(str.contains("Noida"));	
}
}

//14.endsWith():

class MyString
{
public static void main(String[] args)
{
String str = "ducat";
System.out.println(str.endsWith("cat"));	
System.out.println(str.endsWith("du"));	
System.out.println(str.endsWith("t"));	
}
}

//15.startsWith():
class MyString
{
public static void main(String[] args)
{
String str = "ducat";
System.out.println(str.startsWith("cat"));	
System.out.println(str.startsWith("du"));	
System.out.println(str.startsWith("t"));	
}
}
*/
//16.isEmpty():
class MyString
{
public static void main(String[] args)
{
String str = "";
boolean b = str.isEmpty();
if(b)
{
System.out.println("String is emplty");
}
else{
System.out.println("String is not emplty");
}
}
}
