import java.io.*;
import java.net.*;
import java.util.*;
 class arpcontents2
{
public static void send(String ip) throws IOException,UnknownHostException
{
InetAddress i=InetAddress.getByName(ip);
System.out.println("sending request to"+ip);
if(i.isReachable(5000))
System.out.println("Reached");
else
System.out.println("Notb");
}
public static void main(String args[]) throws Exception
{
String ip="127.0.0.1";
send(ip);
}
}
