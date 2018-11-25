import java.io.*;
import java.net.*;
import java.util.*;
class Queue{
int q[],f=0,r=0,size;
void insert(int n)
{
Scanner sc=new Scanner(System.in);
q=new int[10];
for(int i=0;i<n;i++)
{System.out.println("enter i+1 element");
int ele=sc.nextInt();
if(r+1>10)
{
System.out.println("Queue full loss packet"+ele);
break;
}
else
{
r++;
q[i]=ele;
}
}
}
void delete()
{
Thread t=new Thread();
Scanner sc=new Scanner(System.in);
if(r==0)
System.out.println("queue empty");
for(int i=f;i<r;i++)
{
try
{
t.sleep(1000);
}
catch(Exception e)
{}
System.out.println("leaked bucket"+q[i]);
f++;

}
}
}
class leakybucket extends Thread
{
public static void main(String args[])
{
Queue q=new Queue();
Scanner sc=new Scanner(System.in);
System.out.println("enter packet size");
int s=sc.nextInt();
q.insert(s);
q.delete();
}
}
