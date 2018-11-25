import java.io.*;
import java.util.*;
import java.net.*;
class internet2c
{
public static void main(String args[]) throws Exception
{
try{
URL url=new URL("https://www.geeksforgeeks.org/checking-internet-connectivity-using-java/");
URLConnection con=url.openConnection();
con.connect();
System.out.println("success");}
catch(Exception e)
{
System.out.println("failure");
}
}
}
