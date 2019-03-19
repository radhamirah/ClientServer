import java.io.*;  
import java.net.*;  
public class JavaServer {  
public static void main(String[] args){  
ServerSocket ss=new ServerSocket(5506);  
Socket s=ss.accept();//establishes connection   
DataInputStream dis=new DataInputStream(s.getInputStream());  
String  str=(String)dis.readUTF();  
System.out.println("Annyeong "+str);  
ss.close();  
} 
}  
}  
