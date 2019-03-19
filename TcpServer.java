import java.io.*;
import java.net.*;
import java.lang.*;

class TcpServer {
 public static void main(String argv[]) throws Exception {
  String clientSentence;
  String capitalizedSentence;
  ServerSocket welcomeSocket = new ServerSocket(6666);

  while (true) {
   Socket connectionSocket = welcomeSocket.accept();
   BufferedReader inFromClient =
    new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
   DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
   clientSentence = inFromClient.readLine();
   System.out.println("Annyeong. " + clientSentence);
   PrintWriter out = new PrintWriter(skt.getOutputStream(), true) ;
   out.close();
   connectionSocket.close();
   welcomeSocket.close();
   
   
  }
 }
}
