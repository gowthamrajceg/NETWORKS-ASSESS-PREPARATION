import java.io.*;
import java.util.*;
import java.net.*;
import java.lang.*;
class Bucket
{
public int tokens,maxsize;
Bucket(int m)
{
tokens=0;
maxsize=m;
}
synchronized void addToken(int n)
{
if(tokens>=maxsize)
return;
tokens+=1;
System.out.println("added a tokens"+tokens);

}
synchronized void sendpacket(int n)
{
System.out.println("packet of size"+n+"received");
if(n>tokens)
System.out.println("packet discarded");
else
{
tokens-=n;
System.out.println("forwarded packeting");
}
}

}
class AddTokenThread extends Thread
{
Bucket b;
AddTokenThread(Bucket b)
{
this.b=b;
}
public void run()
{
while(true)
{
b.addToken(1);
try
{
Thread.sleep(300);
}
catch(Exception e){}
}
} 
}
class AddPacketThread extends Thread
{
Bucket b;
AddPacketThread(Bucket b)
{
this.b=b;
}
public void run()
{
while(true)
{

try
{
Thread.sleep(500+(int)(Math.random()*3000));
}
catch(Exception e){}
			b.sendpacket(1 +(int)(Math.random()*90));

}
} 
}
class TokenBucket
{
public static void main(String args[])
{
Bucket b=new Bucket(10);
Thread tokens=new AddTokenThread(b);
Thread packets=new AddPacketThread(b);
try{
tokens.start();
packets.start();
}
catch(Exception e){}
}
}
