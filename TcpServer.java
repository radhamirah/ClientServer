import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.ClassNotFoundException;
import java.net.ServerSocket;
import java.net.Socket;


public class TcpServer {
    
   
    private static ServerSocket server;
    
    private static int port = 6666;
  
    public static void main(String args[]) throws IOException, ClassNotFoundException{
       
        server = new ServerSocket(port);
        while(true){
            System.out.println("Waiting for the client");
            
            Socket socket = server.accept();
     
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            
            String message = (String) ois.readObject();
          System.out.println("Message Received: ");
           
          ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
          
            oos.writeObject("Annyeong ");
           
            ois.close();
            oos.close();
            socket.close();
           
            if(message.equalsIgnoreCase("exit")) break;
        }
        System.out.println("Shutting down Socket server!!");
       
      server.close();
    }
}
