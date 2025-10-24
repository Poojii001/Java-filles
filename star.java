/*
1 
1 2
1 2 3
1 2 3 4
1 2 3 4 5

class Pattern
{
public static void main(String[] args)
{
int i ,  j ;
for(i=1; i<=5;i++)
{

for(j=1;j<=i;j++)
{
System.out.print(j);

}
System.out.println();
}}}

12345
-1234
--123
---12
----1
class Numbers
{
public static void main(String[] args)
{
int i ,  j, s, n= 5 ;
for(i=n; i>=1;i--)
{
for(s=0; s< n-i; s++)
{
System.out.print("-");
}
for(j=1;j<=i;j++)
{
System.out.print(j);
}
System.out.println();
}}}

12345
12345
12345
12345
12345
class Pattern
{
public static void main(String[] args)
{
int i ,  j ;
for(i=1; i<=5;i++)
{

for(j=1;j<=5;j++)
{
System.out.print(j);

}
System.out.println();
}}}

12345
1234
123
12
1
class Pattern
{
public static void main(String[] args)
{
int i ,  j ;
for(i=5; i>=1;i--)
{

for(j=1;j<=i;j++)
{
System.out.print(j);

}
System.out.println();
}}}

1
2 3
4 5 6
7 8 9 10


class Pattern
{
public static void main(String[] args)
{
int i ,  j ,c = 1, n=5 ;
for(i=1; i<=n;i++)
{
for(j=1;j<=i;j++)
{
System.out.print(c);
c++;
}
System.out.println();
}}}


A
AB
ABC
ABCD
ABCDE

 class Pattern
{
public static void main(String[] args)
{
int i ,  j ;
for(i=1; i<=5;i++)
{
for(j=1;j<=i;j++)
{
System.out.print((char)(j+64));
}
System.out.println();
}}}

A
BC
DEF
class Pattern
{
public static void main(String[] args)
{
int i ,  j, c=1,n=3 ;
for(i=1; i<=n;i++)
{
for(j=1;j<=i;j++)
{
System.out.print((char)(c+64));
c++;
}
System.out.println();
}}}


class Pattern
{
public static void main(String[] args)
{
int i ,  j , s, n=5;
for(i=1; i<=5;i++)
{
for(s=0;s<=n-i+1;s++)
{
System.out.println(" ");
}
for(j=1;j<=2*i-1;j++)
{
System.out.print("*");
}
System.out.println();
}}}
*/


class Pattern
{
public static void main(String[] args)
{
int i ,  j , s, n=6;
for(i=1; i<=n;i++)
{
for(s=0;s<=n-i;s++)
{
System.out.print(" ");
}
for(j=1;j<=2*i-1;j++)
{
System.out.print(j);
}
System.out.println();
}}}





 