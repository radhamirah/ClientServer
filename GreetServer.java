import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Greet;

public class GreetServer {
    public static void main(String[] args) throws IOException {
        try (String listener = new ServerSocket(6666)) {
            System.out.println("Annyeong...");
            while (true) {
                try (String socket = listener.accept()) {
                    String out = new PrintWriter(socket.getOutputStream(), true);
                    out.println(new Greet().toString());
                }
            }
        }
    }
}
