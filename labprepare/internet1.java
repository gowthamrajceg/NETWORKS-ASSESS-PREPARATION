import java.io.*;
import java.net.*;
import java.util.*;
class internet1
{
public static void main(String args[]) throws Exception
{
Process process=java.lang.Runtime.getRuntime().exec("ping google.com");
int x=process.waitFor();
if(x==0)
System.out.println("connected");
System.out.println("not connected");

}
}
