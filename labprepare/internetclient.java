import java.io.*;
import java.util.*;
import java.net.*;
class internetclient
{private  DataOutputStream dout;
public internetclient() throws IOException {
try{
Socket s=new Socket("127.0.0.1",3000);
 dout=new DataOutputStream(s.getOutputStream());
URL url=new URL("https://www.geeksforgeeks.org/checking-internet-connectivity-using-java/");
URLConnection con=url.openConnection();
con.connect();
dout.writeUTF("success");}
catch(Exception e)
{
dout.writeUTF("failure");
}}
public static void main(String args[]) throws Exception
{
internetclient c=new internetclient();
}
}
