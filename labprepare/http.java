import java.io.*;
import java.net.*;
import java.util.*;
class http
{
public static void main(String args[]) throws IOException
{
ServerSocket ser=new ServerSocket(8080);
System.out.println("listening on connection......");
while(true)
{
try(Socket s=ser.accept())
{String si="time is";
Date today=new Date();
String httpresponse="HTTP/1.1 200 OK\r\n\r\n" + today + si;
s.getOutputStream().write(httpresponse.getBytes("UTF-8"));
}
}

}
}
