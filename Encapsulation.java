class EncapsulationExample
{
private int x;
private int y;
public void setx(int a) // local variable
{
x = a;
}
public int getX()
{
return ++x;
}
public void setX(int b) // local variable
{
y = b;
}
public int getY()
{
return ++Y;
}
public static void main(String[] args)
{
EncapsulationExample  e = new EncapsulationExample();
}
}