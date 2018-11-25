import java.io.*;
import java.net.*;
import java.util.*;
class date1
{
public static void main(String args[]) throws IOException
{
Socket s=new Socket("127.0.0.1",5207);
BufferedReader in=new BufferedReader(new InputStreamReader(s.getInputStream()));
System.out.println(in.readLine());
}
}
