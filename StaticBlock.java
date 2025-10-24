class StaticBlock
{
static int id = 1;
static String name="Pooja";
static String address = "Lucknow";
static String inst = "Ducat School of AI"; 

static
{
System.out.println(id);
System.out.println(name);
System.out.println(address);
System.out.println(inst);
}
public static void main(String[] args)
{
}
}