/*
class Pattern
{
public static void main(String[] args)
{
int i, j;
for(i = 1; i<=3;i++)
{
for(j = 1; j <=3; j++);
{
System.out.println(i+ " " +j);
}}
}}

12345
12345
12345
12345
12345

import java.util.Scanner;
class Pattern
{
public static void main(String[] args)
{
int i ,j;
for(i=1; i<=5;i++)
{
for(j=1;j<=5;j++)
{
System.out.print(j);
}
System.out.println();
}
}
}

123456
234567
345678
456789
5678910
import java.util.Scanner;
class Pattern
{
public static void main(String[] args)
{
int i ,j;
for(i=1; i<=5;i++)
{
for(j=0;j<=5;j++)
{
System.out.print(i+j);
}
System.out.println();
}
}
}
10101
10101
10101
10101
10101
import java.util.Scanner;
class Pattern
{
public static void main(String[] args)
{
int i ,j;
for(i=1; i<=5;i++)
{
for(j=1;j<=5;j++)
{
System.out.print(j%2);
}
System.out.println();
}
}
}

1B3D5
1B3D5
1B3D5
1B3D5
1B3D5
import java.util.Scanner;
class Pattern
{
public static void main(String[] args)
{
int i ,j;
for(i=1; i<=5;i++)
{
for(j=1;j<=5;j++)
{
if(j%2==0)
{
System.out.print((char)(j+64));
}
else
{
System.out.print(j);
}
}
System.out.println();
}
}
}

ABCDE
ABCDE
ABCDE
ABCDE
ABCDE
import java.util.Scanner;
class Pattern
{
public static void main(String[] args)
{
int i ,j;
for(i=1; i<=5;i++)
{
for(j=1;j<=5;j++)
{
System.out.print((char)(j+64));
}
System.out.println();
}
}
}

A
ABC
ABCDE
ABCDEFG
ABCDEFGHI

import java.util.Scanner;
class Pattern
{
public static void main(String[] args)
{
int i ,j;
for(i=1; i<=5;i++)
{
char ch='A';
for(j=1;j<=2*i-1;j++)
{
System.out.print(ch);
ch++;
}
System.out.println();
}}}


ABCDE
ABCD
ABC
AB
A
import java.util.Scanner;
class Pattern
{
public static void main(String[] args)
{
int i ,j;
for(i=1; i<=5;i++)
{
char ch='A';
for(j=1;j<=5-i+1;j++)
{
System.out.print(ch);
ch++;
}
System.out.println();
}}}

*
**
***
****
*****

import java.util.Scanner;
class Pattern
{
public static void main(String[] args)
{
int i ,j;
for(i=1; i<=5;i++)
{
for(j=1;j<=i;j++)
{
System.out.print("*");

}
System.out.println();
}}}


import java.util.Scanner;
class Pattern
{
public static void main(String[] args)
{
int i ,j;
for(i=1; i<=5;i++)
{
for(j=1;j<=i;j++)
{
System.out.print("*");

}
System.out.println();
}}}

*****
  ****
    ***
      **
        *
*/
class Style
{
public static void main(String[] args)
{
int i , j ,s , n=5 ;
for(i=n; i>=1;i--)
{
for(s=0;s<n-i;s++)
{
System.out.println(" ");
}
for(j=1;j<=i;j++)
{
System.out.print("*");

}
System.out.println();
}}}
