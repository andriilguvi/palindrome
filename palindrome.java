import java.io.*;
import java.util.*;
class palindrome
{
public static void main(String args[])
{
int b,c,d=0;
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
c=a;
while(a>0)
{
b=a%10;
a=a/10;
d=d*10+b;
}
if(d==c)
{
System.out.print("palindrome");
}
else
{
System.out.print("not a palindrome");
}
}
}
