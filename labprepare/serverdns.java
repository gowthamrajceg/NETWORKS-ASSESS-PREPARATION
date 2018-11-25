import java.io.*;
import java.util.*;
import java.net.*;
public class serverdns
{
public static void main(String args[]) throws Exception
{
DatagramSocket ds=new DatagramSocket(1309);
while(true)
{
byte[] sb=new byte[1024];
byte[] rb=new byte[1024];
DatagramPacket receiver=new DatagramPacket(rb,rb.length);
ds.receive(receiver);
String str=new String(receiver.getData());
String s=str.trim();
InetAddress addr=receiver.getAddress();
int port=receiver.getPort();
String ip[]={"165.10.10.3"};
String name[]={"www.gowtham.com"};
for(int i=0;i<ip.length;i++)
{
if(s.equals(ip[i]))
{
sb=name[i].getBytes();
DatagramPacket sender=new DatagramPacket(sb,sb.length,addr,port);
ds.send(sender);
break;
}
else if(s.equals(name[i]))
{
sb=ip[i].getBytes();
DatagramPacket sender=new DatagramPacket(sb,sb.length,addr,port);
ds.send(sender);
break;
}

}
}
}
}
