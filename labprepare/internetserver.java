import java.io.*;
import java.net.*;
import java.util.*;

public class internetserver
{
public static void main(String args[]) throws IOException
{
ServerSocket s=new ServerSocket(3000);
System.out.println("waiting for connection");
Socket ss=s.accept();
System.out.println("client connected");
DataInputStream in=new DataInputStream(ss.getInputStream());
DataOutputStream dout=new DataOutputStream(ss.getOutputStream());
String line="";
if((line=in.readUTF())!=null)
{System.out.println(line);
dout.writeUTF("internet connected");
}}
}
