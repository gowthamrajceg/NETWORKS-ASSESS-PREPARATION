import java.io.*;
import java.util.*;
import java.net.*;
class clientdns
{
public static void main(String args[]) throws IOException
{try{
DatagramSocket soc=new DatagramSocket();
InetAddress addr=InetAddress.getByName("127.0.0.1");
byte[] sb=new byte[1024];
byte[] rb=new byte[1024];
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
String str=in.readLine();
sb=str.getBytes();
DatagramPacket sender=new DatagramPacket(sb,sb.length,addr,1309);
soc.send(sender);
DatagramPacket receiver=new DatagramPacket(rb,rb.length);
soc.receive(receiver);
String s=new String(receiver.getData());
System.out.println("IP address is "+s.trim());
soc.close();}
catch(Exception e)
{
System.out.println(e);
}
}
}
