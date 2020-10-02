import java.net.Socket;
import java.io.*;
public class EchoClient{
	public static void main(String[] args)throws IOException {
		Socket client= new Socket("localhost",4444);
			OutputStream os=client.getOutputStream();
			PrintWriter pw=new PrintWriter(os);
			InputStream is=client.getInputStream();
			InputStreamReader isr= new InputStreamReader(is);
			BufferedReader in=new BufferedReader(isr);
			InputStreamReader isr1=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(isr1);
			String line=br.readLine();
			while(!line.equalsIgnoreCase("Quit")){
				out.print(line);
				System.out.println(in.readLine());
				line=br.readLine();
			}
			os.close();
			is.close();
			br.close();

	}

}