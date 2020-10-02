import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;
import java.io.InputStreamReader;
import java.io.PrintReader;

public class EchoServerPart2{
public static void main(String[] args)throws Exception{
boolean flag=true;
Socket client=null;
int count=0;
ServerSocket server=new ServerSocket(4444);
//Socket client=server.accept();
System.out.println("echo server started");
while(flag){
client =server.accept();
talk(client);
//count++;
//System.out.println(count);
}
server.close();
}
public static void talk(Socket client)throws IOException{
OutputStream os=client.getOutputStream();
PrintWriter pw=new PrintWriter(os);
InputStream is=client.getInputStream();
InputStreamReader isr= new InputStreamReader(is);
BufferedReader in=new BufferedReader(isr);
String line=in.readLine();
while(!line.equalsIgnoreCase("Quit")){
out.print(line+ " ..." +line);
line=in.readLine();
}
in.close();
os.close();
}}