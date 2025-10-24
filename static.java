class StaticVariableExample
{
int id;
String name;
String address;
static String inst = "Ducat India";
public static void main(String[] args)
{
StaticVariableExample obj = new StaticVariableExample();
 
obj.id =11;
obj.name="Aman";
obj.address="Jaipur";
System.out.println(obj.id+" " +obj.name +" "+obj.address+" "+obj.inst);

StaticVariableExample obj1 = new StaticVariableExample();
 
obj1.id =22;
obj1.name="Anu";
obj1.address="Delhi";
System.out.println(obj1.id+" " +obj1.name +" "+obj1.address+" "+obj1.inst);


}
}