import java.io.*;
import java.net.*;
import java.util.*;
class arpcontents
{
public static void main(String args[])
{
try
{
Runtime h=Runtime.getRuntime();
Process p=h.exec("arp");
InputStream i=p.getInputStream();String str;
BufferedReader buf=new BufferedReader(new InputStreamReader(i));
while((str=buf.readLine())!=null)
System.out.println(str);
}
catch(Exception i)
{
System.out.println(i);
}
}}
