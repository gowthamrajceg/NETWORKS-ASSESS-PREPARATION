import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
 
public class salclient
{
    public static void main(String[] args) throws IOException
    {
        InetAddress ip = InetAddress.getLocalHost();
        int port = 3000;
        Scanner sc = new Scanner(System.in);
        Socket s = new Socket(ip, port);
        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        while (true)
        {
            System.out.print("Enter the salary per month and the number of months");
            System.out.println("'salary months'");
            String inp = sc.nextLine();
            if (inp.equals("bye"))
                break;
            dos.writeUTF(inp);
            String ans = dis.readUTF();
            System.out.println("Salary=" + ans);
        }
    }
}

