import java.io.*;
import java.net.*;
import java.util.*;
class http2
{
public static void main(String args[]) throws IOException
{
ServerSocket ser=new ServerSocket(8080);
System.out.println("listening on the port 8080.....");
while(true)
{
try(Socket s=ser.accept())
{
BufferedReader buf=new BufferedReader(new InputStreamReader(s.getInputStream()));
String Line=buf.readLine();
String httpresponse;
Scanner in=new Scanner(System.in);
String Lines=in.nextLine();
while(Line!=null)
{
System.out.println(Line);

String httpresponses="HTTP/1.1 200 OK\r\n\r\n" + Lines;
Line=buf.readLine();
}
}
}
}
}
