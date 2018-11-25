import java.io.*;
import java.net.*;
import java.util.*;
class revserver1
{
public static void main(String args[]) throws Exception
{
ServerSocket s=new ServerSocket(3000);
System.out.println("wait for client");
Socket ss=s.accept();
System.out.println("client connected");
DataInputStream in=new DataInputStream(ss.getInputStream());
DataOutputStream out=new DataOutputStream(ss.getOutputStream());

String line=" ";
while(true){
line=in.readUTF();
System.out.println("received"+line);
StringBuilder str=new StringBuilder();
str.append(line);str.reverse();
out.writeUTF(str.toString());

}
}
}
