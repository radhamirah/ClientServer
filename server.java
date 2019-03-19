import java.io.IOException;
import java.net.ServerSocket;


public class JavaServer
{
 public static void main(String args[]) throws IOException
 { 
   ServerSocket ss=new ServerSocket(5506) ;
   Socket s=ss.accept();

   System.out.println("client connected");

   InputStreamReader in=new InputStreamReader(s.getInputStream());
   BufferedReader bf=new BufferedReader(in);

   String str=bf.readLine();
   System.out.println("client : "+ str);

   PrintWriter pr=new PrintWriter(s.getOutputStream());
   pr.println("Hello");
   pr.flush();
  }
}
