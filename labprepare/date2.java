import java.io.*;
import java.net.*;
import java.util.*; 
class date2{
public static void main(String args[]) throws IOException
{
ServerSocket ser=new ServerSocket(5207);
while(true)
{
Socket s=ser.accept();
DataOutputStream out=new DataOutputStream(s.getOutputStream());
out.writeBytes("sERVERDATE"+(new Date()).toString() +"\n");
}
}
}
