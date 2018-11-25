import java.io.*;
import java.net.*;
public class arpcontents3
{
public static  void runSystemCommand(String command)
{try{
Process p=Runtime.getRuntime().exec(command);
BufferedReader in=new BufferedReader(new InputStreamReader(p.getInputStream()));
String s="";
while((s=in.readLine())!=null)
System.out.println(s);
}
catch(Exception e){
e.printStackTrace();
}}
public static void main(String args[]){
String ip="google.com";
runSystemCommand("ping " + ip);
}
}
