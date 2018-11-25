import java.io.*;
import java.net.*;import java.util.*;
class revclient1
{
public static void main(String args[]) throws IOException
{
InetAddress addr=InetAddress.getLocalHost();
int port=3000;
Socket s=new Socket(addr,port);
System.out.println("connected");
DataInputStream in=new DataInputStream(s.getInputStream());
DataOutputStream out=new DataOutputStream(s.getOutputStream());
Scanner sc=new Scanner(System.in);
String line1=" ";String line=" ";
while(true)
{
System.out.println("string to be reverse");
line=sc.next();
if(line.equals("bye"))
break;
out.writeUTF(line);
line1=in.readUTF();
System.out.println("received"+line1);


}
}
}
