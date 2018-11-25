import java.io.*;
import java.util.*;
import java.util.*;
class quad
{
public static void main(String args[])
{
int a,b,c;double root1,root2;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();c=sc.nextInt();
System.out.println(a+"x2"+b+"x"+c);
int d=b*b-4*a*c;
if(d>0)
{
System.out.println("roots are unequal,real");
root1=(-b+Math.sqrt(d))/2*a;
System.out.println(root1);
root2=(-b-Math.sqrt(d))/2*a;
System.out.println(root2);


}
else if(d==0)
{
System.out.println("roots are equal,real");
root1=(-b+Math.sqrt(d))/2*a;
System.out.println(-root1);
}
else
{
System.out.println("roots are imaginary");
}
}
}
