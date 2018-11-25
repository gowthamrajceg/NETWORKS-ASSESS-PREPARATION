import java.io.*;
import java.net.*;

public class download
{
public static void Download(String webpage) throws IOException,MalformedURLException
{
URL url=new URL(webpage);
BufferedReader reader=new BufferedReader(new InputStreamReader(url.openStream()));
BufferedWriter writer=new BufferedWriter(new FileWriter("Download.html"));
String str;
while((str=reader.readLine())!=null)
{
writer.write(str);
}
System.out.println("Downloaded");
}
public static void main(String args[]) throws IOException
{
String url="https://github.com/sbenstewart/networks/edit/master/4/http1.java";
Download(url);
}
}
