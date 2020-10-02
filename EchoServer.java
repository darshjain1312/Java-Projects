import java.net.ServerSocket;
import java.net.Socket;
public class EchoServer{
public static void main(String[] args)throws Exception{
boolean flag=true;
Socket client=null;
int count=0;
ServerSocket server=new ServerSocket(4444);
//Socket client=server.accept();
System.out.println("echo server started");
while(flag){
client =server.accept();
count++;
System.out.println(count);
}
}}